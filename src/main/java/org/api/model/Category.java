package org.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category extends PanacheEntity {
    public String description;
    public String initials;

    public Category() {
    }

    public Category(Long id, String description, String initials) {
        this.id = id;
        this.description = description;
        this.initials = initials;
    }
}
