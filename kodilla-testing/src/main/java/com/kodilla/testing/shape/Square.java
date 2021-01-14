package com.kodilla.testing.shape;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Square implements Shape {

    private int sideOfSquare; //to calculate the area of square
    private double SquareField; //return square field side*side

    public Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public String shapeName() {
        return (this.getClass().getSimpleName());
    }

    @Override
    public double fieldSurfaceFigure() {
        SquareField = (sideOfSquare * sideOfSquare);
        return this.SquareField;
    }
    @Override
    public String toString() {
        return ((this.getClass().getSimpleName()) + " has field value: " + SquareField);
    }
}