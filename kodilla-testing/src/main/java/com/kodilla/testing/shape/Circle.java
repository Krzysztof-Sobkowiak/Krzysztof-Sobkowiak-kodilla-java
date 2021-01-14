package com.kodilla.testing.shape;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Circle implements Shape {

    private final int radiusOfCircle;
    private final double valuePi = 3.14;
    private double circleField; // pi*r2

    public Circle(int radiusOfCircle ){
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public String getShapeName() {
        return (this.getClass().getSimpleName());
    }

    @Override
    public double getField() {
        circleField = valuePi * (radiusOfCircle * radiusOfCircle);
        return this.circleField;
    }
    @Override
    public String toString(){
        return (this.getClass().getSimpleName()) + " has field value: " + circleField;
    }
}