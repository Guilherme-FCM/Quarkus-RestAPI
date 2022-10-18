package org.api;

import org.api.model.Category;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/category")
public class CategoryResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> findAll() {
        return List.of(
            new Category(1L, "Electronics", "ELT"),
            new Category(2L, "Smartphones", "STP")
        );
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Category findById() {
        Category category = new Category();
        category.id = 1L;
        category.description = "Electronics";
        category.initials = "ELT";
        return category;
    }
}