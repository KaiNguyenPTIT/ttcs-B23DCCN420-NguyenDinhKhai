package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;

    public Category() {}

    //Getter
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Product> getProducts() {
        return products;
    }  
    
    //Setter
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}