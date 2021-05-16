//package com.myretail.model;
//import javax.persistence.*;
//
////mark class as an Entity
//@Entity
////defining class name as Table name
//@Table
//public class Product2
//{
//    //Defining book id as primary key
//    @Id
//    @Column
//    private int productId;
//
//    @OneToOne(targetEntity = CurrentPrice.class, mappedBy = "priceId")
//    private CurrentPrice current_price;
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//
//    public CurrentPrice getCurrent_price() {
//        return current_price;
//    }
//
//    public void setCurrent_price(CurrentPrice current_price) {
//        this.current_price = current_price;
//    }
//
//
//    //    @Column(name = "currencyCode")
////    private String currency_code;
////
////    public int getProductid()
////    {
////        return productId;
////    }
////    public void setProductid(int productId)
////    {
////    this.productId = productId;
////    }
////    public String getCurrentprice()
////    {
////    return current_price;
////    }
////    public void setCurrentprice(String current_price)
////    {
////    this.current_price = current_price;
////    }
////    public String getCurrencycode()
////    {
////    return currency_code;
////    }
////    public void setCurrencycode(String currency_code)
////    {
////    this.currency_code = currency_code;
////    }
//}