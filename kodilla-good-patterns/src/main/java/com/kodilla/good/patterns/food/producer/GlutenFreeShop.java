package com.kodilla.good.patterns.food.producer;

import com.kodilla.good.patterns.food.service.ProducerService;

public class GlutenFreeShop implements ProducerService {

   public boolean process() {
       System.out.println("=== Gluten Free Shop ===");
       System.out.println("Your order is in progress");
       System.out.println("We provide highest quality products");
       System.out.println("You can find all gluten-free products with us.");

       return true;
   }
}
