package com.sbapp.api.rest.service.customerorder.processor;


import com.sbapp.api.rest.service.customerorder.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * Processor that processes orders other than UK, USA
 */
@Component
public class DefaultOrderProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("Not Applicable");
        exchange.getIn().setBody(orderResponse);
    }
}
