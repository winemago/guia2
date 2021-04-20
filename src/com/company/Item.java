package com.company;

import java.util.UUID;

public class Item {
    private static String id;
    private String name;
    private String description;
    private double price;

    public Item(String name, String description, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID= " + id +
                " name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
