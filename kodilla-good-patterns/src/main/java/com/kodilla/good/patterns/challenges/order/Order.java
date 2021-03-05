package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.user.User;
import com.kodilla.good.patterns.challenges.user.UserContact;
import com.kodilla.good.patterns.challenges.user.UserData;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int sum = 0;

    public CustomerOrder shoppingCart() {

        UserData userData = new UserData("Głogowska ", "1111", "111", "Poznań", "12-345");
        UserContact contact = new UserContact("123-456-789", "abcd@abc.com");

        User user = new User("Krzysztof_1234", "Krzysztof", "Sobkowiak", userData, contact);

        Product product1 = new Product("Laptop Dell ASV-456", 5,2500,2500);
        Product product2 = new Product("Laptop HP DSH-443", 2, 1520,3040);
        Product product3 = new Product("Mouse Corsair DFG", 1, 220,220);
        Facture facture = new Facture(435);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        System.out.println("=== Order List ===");
        for(Product list: productList) {
            sum += list.getTotalPrice();
            System.out.println("Product: " + list.getProductName() + " " +
                               "quantity: " + list.getQuantity() + " " +
                               "price per each: " + list.getPrice() + "PLN" + " " +
                               "total price: " + list.getTotalPrice());
        }

        System.out.println("Total price for all products: " + sum + " PLN\n");

        return new CustomerOrder(user,facture);

    }
}
