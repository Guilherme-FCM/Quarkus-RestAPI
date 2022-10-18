package org.api;

import org.api.model.Category;

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
    public void destroy(@PathParam("id") Long id) {
        Category.deleteById(id);
    }

    @POST
    public Category create(Category category) {
        Category.persist(category);
        return category;
    }
}