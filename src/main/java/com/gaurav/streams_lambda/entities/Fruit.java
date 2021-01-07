package com.gaurav.streams_lambda.entities;

import java.math.BigDecimal;

public class Fruit {

    String itemName;
    int itemQuantity;

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public BigDecimal getPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    BigDecimal itemPrice;

    public Fruit(String itemName, int itemQuantity, BigDecimal itemPrice) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "itemName='" + itemName + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
