package com.myretail.model;
//
//import javax.persistence.*;
//
////mark class as an Entity
//@Entity
////@Table
//public class CurrentPrice2 {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int priceId;
//
//    @OneToOne(mappedBy = "currentPrice")
//    private Product product;
//
////    @Column(name = "value")
//    public double value;
//
//    public int getPriceId() {
//        return priceId;
//    }
//
//    public void setPriceId(int priceId) {
//        this.priceId = priceId;
//    }
//
//    //    @Column(name = "currencyCode")
////    public String currency_code;
//
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    public Product getProduct() {
////        return product;
////    }
////
////    public void setProduct(Product product) {
////        this.product = product;
////    }
//
//    public double getValue() {
//        return value;
//    }
//
//    public void setValue(double value) {
//        this.value = value;
//    }
//
////    public String getCurrency_code() {
////        return currency_code;
////    }
////
////    public void setCurrency_code(String currency_code) {
////        this.currency_code = currency_code;
////    }
//}