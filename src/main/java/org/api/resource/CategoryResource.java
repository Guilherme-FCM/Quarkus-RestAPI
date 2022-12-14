package org.api.resource;

import io.quarkus.hibernate.orm.panache.runtime.JpaOperations;
import org.api.model.Category;

import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/category")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoryResource {

    @GET
    public List<Category> findAll() {
        return Category.listAll();
    }

    @GET
    @Path("/{id}")
    public Category findById(@PathParam("id") Long id) {
        return Category.findById(id);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void destroy(@PathParam("id") Long id) {
        Category.deleteById(id);
    }

    @POST
    @Transactional
    public Category create(Category category) {
        category.persistAndFlush();
        return category;
    }

    @Transactional
    @Path("/{id}")
    @PUT
    public void update(@PathParam("id") Long id, Category category){
        try {
            var em = JpaOperations.INSTANCE.getEntityManager();
            em.merge(category);
        } catch (OptimisticLockException e){
            throw new WebApplicationException("Registro alterado por outro usuário.");
        }
    }
}