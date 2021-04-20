package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	   /* Author autor = new Author("Joshua","Bloch","joshua@email.com",true );
        Author autor2 = new Author("nacho","viejo","nachota@email.com",true );

        System.out.println("Author: " + autor.getEmail() + "lastname: " + autor.getLastName() + "Gender: " +  autor.getName());
	    if(autor.isMale()){
            System.out.println("macho");
        }else{
            System.out.println("femi");
        }

	    Book book = new Book("Effective Java",450,150);
	    book.addAuthor(autor);
        book.addAuthor(autor2);

        System.out.println("titulo: " + book.getTitule() + " autor/s: " + book.toString() + "precio: " + book.getPrice() + " stock: " +  book.getStock());

        book.setPrice(500);
        book.setStock(book.getStock()+50);
        System.out.println(book.getStock());
        book.printmsj();
    */
    Client clt = new Client("sergio","sergio@email.com",10);

    System.out.println(clt.toString());

    Receipt rcp = new Receipt(clt,1000);

    Item newItem = new Item("ryzen 5","6 nucleos - 12 nucleos",200);
    Item newItem2 = new Item("Ram","8GB - 3000Mhz",50);

    rcp.addItem(newItem);
    rcp.addItem(newItem2);

    rcp.totalWdescount(rcp);

    System.out.println(rcp.toString());


    }
}
