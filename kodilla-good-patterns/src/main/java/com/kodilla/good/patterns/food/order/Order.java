package com.kodilla.good.patterns.food.order;

import com.kodilla.good.patterns.food.user.User;
import com.kodilla.good.patterns.food.user.UserContact;
import com.kodilla.good.patterns.food.user.UserData;

import java.util.ArrayList;
import java.util.List;

public class Order {

    double price = 0;

    public CustomerOrder shoppingCartGlutenFree() {
        UserData userData = new UserData("Głogowska ", "1111", "111", "Poznań", "12-345");
        UserContact userContact = new UserContact("123-456-789","abc@abc.com");
        User user = new User("Krzysztof", "Sobkowiak",userContact,userData);

        Product product = new Product("Corn Flakes", 2, 5.50);
        Product product1 = new Product("Bred free-gluten ", 3, 3.50);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);

        System.out.println("\t === Order Products ===");
        for(Product list: productList) {
            price = list.getQuantity() * list.getPricePerEach();
            System.out.println("Product: " + list.getProductName()
                                           + " Quantity: " + list.getQuantity() + ", "
                                           + "Price per each: " + list.getPricePerEach()
                                           + " PLN" + "Total price: " + price + " PLN");
        }

        System.out.println("Total price for all products: " + price + " PLN\n");

        return new CustomerOrder(user);


    }

    public CustomerOrder shoppingCartHealthy() {
        UserData userData = new UserData("Wrocławska ", "1", "144", "Wrocław", "32-333");
        UserContact userContact = new UserContact("123-456-333","abcd@abc.com");
        User user = new User("Jan", "Kowalski",userContact,userData);

        Product product = new Product("Bio-Apple", 10, 0.70);
        Product product1 = new Product("Bio-Meat ", 5, 10.50);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);

        System.out.println("\t === Order Products ===");
        for(Product list: productList) {
            price = list.getQuantity() * list.getPricePerEach();
            System.out.println("Product: " + list.getProductName()
                                           + " Quantity: " + list.getQuantity() + ", "
                                           + "Price per each: " + list.getPricePerEach() + " PLN "
                                           + "Total price: " + price + " PLN");
        }

        System.out.println("Total price for all products: " + price + " PLN\n");

        return new CustomerOrder(user);

    }

    public CustomerOrder shoppingCartExtra() {
        UserData userData = new UserData("Krakowska ", "121", "123", "Kraków", "22-444");
        UserContact userContact = new UserContact("123-222-789","abcde@abc.com");
        User user = new User("Tomasz", "Tomaszewski",userContact, userData);

        Product product = new Product("Beef", 4, 23.50);
        Product product1 = new Product("Butter", 5, 4.30);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);

        System.out.println("\t === Order Products ===");
        for(Product list: productList) {
            price = list.getQuantity() * list.getPricePerEach();
            System.out.println("Product: " + list.getProductName()
                                           + " Quantity: " + list.getQuantity() + ", "
                                           + "Price per each: " + list.getPricePerEach() + " PLN "
                                           + "Total price: " + price + " PLN");
        }

        System.out.println("Total price for all products: " + price + " PLN\n");

        return new CustomerOrder(user);

    }
}
