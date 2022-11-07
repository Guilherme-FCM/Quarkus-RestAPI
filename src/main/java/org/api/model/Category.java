package org.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity {
    @Version
    public long version;

    public String description;
    public String initials;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    public List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(String description, String initials) {
        this.description = description;
        this.initials = initials;
    }
}
