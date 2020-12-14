package com.kodilla.testing;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int add = calculator.addAToB(7, 5);
        int substract = calculator.substractAFromB(15,5);

        if (add != 12) {
            System.out.println("Error");
        } else {
            System.out.println("Result calculator adding test: OK");
        }
        if (substract != 10) {
            System.out.println("Error");
        } else {
            System.out.println("Result calculator substract test: OK");
        }
    }
}
