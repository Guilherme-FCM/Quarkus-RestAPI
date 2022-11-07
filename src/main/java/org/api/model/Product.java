package org.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.util.Objects;

@Entity
public class Product extends AbstractEntity{
    @Version
    public long version = 0L;

    public String name;

    @ManyToOne
    public Category category;

    public void setName(String name){
        Objects.requireNonNull(name, "Name don't be null.");
        this.name = name.trim().toUpperCase();
    }
}
