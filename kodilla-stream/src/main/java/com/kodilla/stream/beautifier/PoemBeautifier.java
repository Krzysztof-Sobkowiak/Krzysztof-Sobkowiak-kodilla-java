package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String string, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(string);
        System.out.println("=== Text Beautification === ");
        return result + "\n";
    }
}
