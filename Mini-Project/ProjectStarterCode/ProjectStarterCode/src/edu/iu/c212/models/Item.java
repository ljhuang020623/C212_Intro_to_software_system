package edu.iu.c212.models;

public class Item {
    private final String name;
    private final double price;
    private final int quantity;
    private final int aisleNum;
    public Item(String name, double price, int quantity, int aisleNum){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.aisleNum = aisleNum;
    }
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public int getAisle() {return aisleNum;}
}

