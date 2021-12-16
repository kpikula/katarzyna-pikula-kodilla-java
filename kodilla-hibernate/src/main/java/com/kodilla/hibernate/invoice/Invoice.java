package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int InvoiceId;
    private String number;
    private List<Item> items;

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    public Invoice() {

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getInvoiceId() {
        return InvoiceId;
    }

    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }


    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setInvoiceId(int id) {
        this.InvoiceId = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
