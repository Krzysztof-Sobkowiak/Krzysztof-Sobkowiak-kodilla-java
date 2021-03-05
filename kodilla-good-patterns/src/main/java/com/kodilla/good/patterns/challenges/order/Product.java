package com.kodilla.good.patterns.challenges.order;

public class Product {

    private String productName;
    private int quantity;
    private int price;
    private int totalPrice = price * quantity;

    public Product(String productName ,int quantity, int price, int totalPrice) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;

    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return totalPrice = price * quantity;
    }

    @Override
    public String toString() {
        return "Product " + productName + ", quantity = " + quantity + ", price = " + price + ", total price = " + totalPrice;
    }
}