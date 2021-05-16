package com.myretail.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

//mark class as an Entity
@Entity
//defining class name as Table name
//@Table
public class Product {
    //Defining product id as primary key
    @Id
    private int productId;

    private double value;

    private String currencyCode;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}