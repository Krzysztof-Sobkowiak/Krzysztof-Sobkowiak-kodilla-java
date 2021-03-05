package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.service.PaymentService;

public class BankService implements PaymentService {

    public boolean payment(final Order order, boolean paid) {
        if(paid) {
            System.out.println("Bank: Payment Completed\n");
            return true;
        } else {
            System.out.println("Please pay for the delivery so then the order can be processed\n");
            return false;
        }
    }
}
