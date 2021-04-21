package com.company;

import java.util.UUID;

public class ClientBank {
    private static String id;
    private String name;
    private char gender;

    public ClientBank(String name, char gender) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ClientBank{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
