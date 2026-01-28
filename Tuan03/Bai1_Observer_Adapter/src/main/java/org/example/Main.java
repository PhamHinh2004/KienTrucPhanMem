package org.example;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Investor a = new Investor("An");
        Investor b = new Investor("Bình");

        stock.attach(a);
        stock.attach(b);

        stock.setPrice(100);
        stock.setPrice(120);
    }
}