package org.api.model;

import javax.persistence.Entity;

@Entity
public class Category extends AbstractEntity {
    public String description;
    public String initials;
    public Category() {
    }

    public Category(String description, String initials) {
        this.description = description;
        this.initials = initials;
    }
}
