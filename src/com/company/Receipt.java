package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Receipt {
    private static String id;
    private static LocalDate date;
    private double total;
    private double finalTotal;
    private Client clt;
    private ArrayList<Item> Items;

    public Receipt(Client clt, double total) {
        this.id = UUID.randomUUID().toString();
        this.date = LocalDate.now();
        this.clt = clt;
        this.Items = new ArrayList<Item>();
    }

    public Client getClt() {
        return clt;
    }

    public double getTotal() {
        return total;
    }

    public void totalWdescount(Receipt rcp){
        double suma = 0;
        double desc = (rcp.getClt().getDescount() / 100);
        suma = total  * desc;
        suma = total - suma;
        finalTotal = suma;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "ID=" + id +
                "date=" + date +
                "cliente=" + clt +
                " Items+ " + Items +
                " total=" + total +
                ", finalTotal=" + finalTotal +
                '}';
    }

    public void addItem(Item newItem){
        Items.add(newItem);
        total += newItem.getPrice();
    }
}
