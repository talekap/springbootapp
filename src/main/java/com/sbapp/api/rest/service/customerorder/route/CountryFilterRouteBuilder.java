package com.sbapp.api.rest.service.customerorder.route;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbapp.api.rest.service.customerorder.customer.OrderRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.io.DataInput;
import java.util.LinkedHashMap;

import static java.util.Optional.ofNullable;

/**
 * Route builder to set country
 */
@Component
public class CountryFilterRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {
        from("direct:filterCountry").process(exchange -> {
            ObjectMapper mapper = new ObjectMapper();
            if (exchange.getIn().getBody() != null) {
                OrderRequest request = mapper.readValue((String) exchange.getIn().getBody(), OrderRequest.class);
                if (ofNullable(request).isPresent()) {
                    exchange.getIn().getHeaders().put("country", request.getCountry());
                }
            }
        });
    }
}
