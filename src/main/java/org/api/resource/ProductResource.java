package org.api.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import org.api.model.Product;

public interface ProductResource extends PanacheEntityResource<Product, Long> {
}
