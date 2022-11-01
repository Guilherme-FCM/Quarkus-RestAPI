package org.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Product extends AbstractEntity{
    public String name;

    @ManyToOne
    public Category category;

    public void setName(String name){
        Objects.requireNonNull(name, "Name don't be null.");
        this.name = name.trim().toUpperCase();
    }
}
