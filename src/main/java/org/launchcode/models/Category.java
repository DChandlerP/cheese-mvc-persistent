package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidprince on 7/20/17.
 */

@Entity //Annotation for making class persistent and mapped to a relational database table
public class Category {

    @Id //lets the API know what this is a primary key id
    @GeneratedValue //automatically generates id
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @OneToMany //one-to-many relationship: Each one category will have many cheeses, but each cheese can have only one category.
    @JoinColumn(name = "category_id") //tells Hibernate to use the category_id column of the cheese table to determine which cheese belong to a given category.
    private List<Cheese> cheeses = new ArrayList<>();

    // ID is set automatically
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // default constructor
    public Category() {
    }

    // overloading that uses only string as param
    public Category(String name) {
        this.name = name;
    }
    public List<Cheese> getCheeses() {
        return cheeses;
    }
}
