package com.company;

import java.util.UUID;

public class Client {
    private static String id;
    private String name;
    private String email;
    private double descount;

    public Client(String name, String email, double descount) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.descount = descount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescount() {
        return descount;
    }

    public void setDescount(double descount) {
        this.descount = descount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + id +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", descount=" + descount +
                '}';
    }

}
