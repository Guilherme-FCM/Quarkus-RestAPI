package org.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Product extends AbstractEntity{
    public String name;

    @ManyToOne
    public Category category;
}
