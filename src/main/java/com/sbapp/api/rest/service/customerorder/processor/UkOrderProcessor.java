package com.sbapp.api.rest.service.customerorder.processor;

import com.sbapp.api.rest.service.customerorder.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * Processor that processes UK orders
 */
@Component
public class UkOrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("UK");
        exchange.getIn().setBody(orderResponse);
    }
}
