package com.kodilla.good.patterns.food.producer;

import com.kodilla.good.patterns.food.service.ProducerService;

public class HealthyShop implements ProducerService {

    public boolean process() {
        System.out.println("=== Healthy Shop ===");
        System.out.println("Your order is in progress");
        System.out.println("We provide highest quality healthy products");
        System.out.println("You can find all healthy products with us.");

        return true;
    }
}