package com.sbapp.api.rest.service.customerorder.customer;

import org.springframework.stereotype.Component;

import javax.xml.ws.BindingType;

/**
 * Request POJO class
 */
@Component
public class OrderRequest {
    private String name;
    private String number;
    private String country;
    private String amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
