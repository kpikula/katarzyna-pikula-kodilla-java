package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;
    private List<Item> items;

    public Product(String name) {

        this.name = name;
    }

    public Product() {

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "" + name + "";
    }
}
