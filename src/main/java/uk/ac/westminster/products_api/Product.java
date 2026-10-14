package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    // No-arg constructor (needed for JSON deserialization in POST requests)
    public Product() {}

    // Parameterized constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters following JavaBean naming conventions
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}