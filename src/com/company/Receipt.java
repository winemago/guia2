package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Receipt {
    private static String id;
    private static LocalDate date;
    private double total;
    private double finalTotal;
    private Client clt;

    public Receipt(Client clt, double total) {
        this.id = UUID.randomUUID().toString();
        this.date = LocalDate.now();
        this.clt = clt;
        this.total = total;
        this.finalTotal = totalWdescount(clt);

    }

    public double getTotal() {
        return total;
    }

    public double totalWdescount(Client clt){
        double total;
        double desc = (clt.getDescount() / 100) + 1;
        total = getTotal() * desc;
        return total;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "ID=" + id +
                "date=" + date +
                "cliente=" + clt +
                "total=" + total +
                ", finalTotal=" + finalTotal +
                '}';
    }
}
