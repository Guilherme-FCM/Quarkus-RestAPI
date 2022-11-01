package org.api.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import org.api.model.Product;

public interface ProductResource extends PanacheEntityResource<Product, Long> {
    @MethodProperties(exposed = false)
    long count();
}
