package com.myretail.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

//mark class as an Entity
//@Entity
//defining class name as Table name
//@Table
public class ProductDAO {
    //Defining product id as primary key

    @JsonProperty("id")
    private int productId;

    @JsonProperty("current_price")
    private CurrentPrice currentPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "ProductDAO{" +
                "productId=" + productId +
                ", value" + currentPrice.getValue() +
                ", currency code=" + currentPrice.getCurrency_code() +
                '}';
    }
}