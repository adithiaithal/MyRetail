package com.myretail.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import lombok.Data;

//mark class as an Entity
//@Entity
//@Table
public class CurrentPrice {

    @JsonProperty("value")
    private double value;

    @JsonProperty("currency_code")
    private String currency_code;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}