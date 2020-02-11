package com.sbapp.api.rest.service.customerorder.route;

import com.sbapp.api.rest.service.customerorder.processor.OrderResponseProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Route builder that uses Content based router pattern
 */
@Component
public class CustomerOrderRouteBuilder extends RouteBuilder {

    @Autowired
    private OrderResponseProcessor orderResponseProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:placeOrder")
                .convertBodyTo(String.class)
                .to("direct:filterCountry")
                .choice()
                .when(header("country").isEqualTo("UK"))
                .to("direct:orderUK")
                .when(header("country").isEqualTo("USA"))
                .to("direct:orderUSA")
                .otherwise()
                .to("direct:orderDefault")
                .end()
                .process(orderResponseProcessor);
    }
}
