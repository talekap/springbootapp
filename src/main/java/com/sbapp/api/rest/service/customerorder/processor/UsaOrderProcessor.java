package com.sbapp.api.rest.service.customerorder.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbapp.api.rest.service.customerorder.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * Processor that processes USA orders
 */
@Component
public class UsaOrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("USA");
        exchange.getIn().setBody(orderResponse);
    }
}
