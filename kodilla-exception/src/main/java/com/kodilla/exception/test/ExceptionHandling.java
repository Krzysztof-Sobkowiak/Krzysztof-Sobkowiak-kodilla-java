package com.kodilla.exception.test;

public class ExceptionHandling{
    public static void main(String[] args) throws Exception{
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            secondChallenge.probablyIWillThrowException(2.0, 1.5);;
        } catch(Exception e){
           System.out.println("(x >= 2 || x < 1 || y == 1.5) Use different values to handle the exception. Error:" + e);
        } finally {
            System.out.println("Expected values of handle the exception: x equal or more than 1.0 and less than 2.0 and y not equal to 1.5");
        }
    }
}
