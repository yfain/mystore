package com.yfain.controller;

public class Product {
    public int id;
    public String title;
    public double price;
    public double rating;
    public String shortDescription;
    public String description;
    public String[] categories;

    public Product(int id, String title, double price, double rating,
                   String shortDescription, String description, String[] categories){
        this.id=id;
        this.title=title;
        this.price=price;
        this.rating=rating;
        this.shortDescription=shortDescription;
        this.description=description;
        this.categories=categories;
    }
}
