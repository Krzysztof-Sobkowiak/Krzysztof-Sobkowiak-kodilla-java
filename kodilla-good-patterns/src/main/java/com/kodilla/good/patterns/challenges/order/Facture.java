package com.kodilla.good.patterns.challenges.order;

public class Facture extends Order {
    private int facture;

    public Facture(int facture) {
        this.facture = facture;
    }

    public int getFacture() {
        return facture;
    }

    @Override
    public String toString() {
        return "Facture" + " orderNumber = " + facture;
    }
}
