package com.company;
import java.util.ArrayList;

public class Book {
    private String titule;
    private double price;
    private int stock;
    private ArrayList<Author> authors;

    public Book(String titule, double price, int stock) {
        this.titule = titule;
        this.price = price;
        this.stock = stock;
        this.authors = new ArrayList<Author>();
    }

    public String getTitule() {
        return titule;
    }

    public void setTitule(String titule) {
        this.titule = titule;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Author> getAuthor() {
        return authors;
    }

    public void setAuthor(ArrayList<Author> author) {
        this.authors = author;
    }

    public void printmsj(){
        System.out.println(new StringBuilder().append("EL libro, ").append(getTitule()).append(" de ").append(getAuthor()).append(" .Se vende a ").append(getPrice()).append(" pesos").toString());
    }
    public void addAuthor(Author author){
        authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titule='" + titule + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", authors=" + authors+
                '}';
    }


}
