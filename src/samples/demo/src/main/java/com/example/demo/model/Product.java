package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private Double price;
    private int volume;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    // Constructer
    public Product() {}
    public Product(Long id, String name, String brand, Double price, int volume, String description, Category category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
        this.description = description;
        this.category = category;
    }
    //Getter
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public Double getPrice() {
        return price;
    }
    public int getVolume() {
        return volume;
    }

    public String getDescription() {
        return description;
    }
    public Category getCategory() {
        return category;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}