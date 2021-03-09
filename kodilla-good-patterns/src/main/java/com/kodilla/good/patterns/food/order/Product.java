package com.kodilla.good.patterns.food.order;

public class Product {
    private String productName;
    private int quantity;
    private double pricePerEach;

    public Product(String productName, int quantity, double pricePerEach) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerEach = pricePerEach;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerEach() {
        return pricePerEach;
    }
}
