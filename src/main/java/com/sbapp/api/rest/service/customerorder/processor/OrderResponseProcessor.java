package com.sbapp.api.rest.service.customerorder.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbapp.api.rest.service.customerorder.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = (OrderResponse) exchange.getIn().getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writeValueAsString(orderResponse);
        exchange.getOut().setBody(jsonInString);
    }
}
