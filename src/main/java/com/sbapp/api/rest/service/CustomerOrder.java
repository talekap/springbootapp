package com.sbapp.api.rest.service;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;

@Component
public class CustomerOrder extends RouteBuilder {

    @Override
    public void configure(){

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.off)
                .dataFormatProperty("prettyPrint", "true");

        rest("/customer")
                .post("/placeorder").to("direct:placeOrder")
                .consumes(MediaType.APPLICATION_JSON)
                .produces(MediaType.APPLICATION_JSON);
    }
}
