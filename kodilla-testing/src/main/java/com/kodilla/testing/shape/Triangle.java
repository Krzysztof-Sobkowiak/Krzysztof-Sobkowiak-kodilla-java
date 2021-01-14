package com.kodilla.testing.shape;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Triangle implements Shape {

    private int triangleBase;
    private int triangleHeight;
    private double triangleField;

    public Triangle(int triangleBase, int triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;

    }

    @Override
    public String shapeName() {
        return (this.getClass().getSimpleName());
    }

    @Override
    public double fieldSurfaceFigure() {
        triangleField = (triangleBase * triangleHeight) / 2;
        return this.triangleField;
    }
    @Override
    public String toString() {
        return ((this.getClass().getSimpleName()) + " has field value:  " + triangleField);
    }
}