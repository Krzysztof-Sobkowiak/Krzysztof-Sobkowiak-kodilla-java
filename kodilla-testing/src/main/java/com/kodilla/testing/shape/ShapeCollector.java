package com.kodilla.testing.shape;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return this.figures.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return this.figures;
    }
}