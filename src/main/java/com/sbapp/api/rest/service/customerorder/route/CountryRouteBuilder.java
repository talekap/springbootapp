package com.sbapp.api.rest.service.customerorder.route;

import com.sbapp.api.rest.service.customerorder.processor.DefaultOrderProcessor;
import com.sbapp.api.rest.service.customerorder.processor.OrderResponseProcessor;
import com.sbapp.api.rest.service.customerorder.processor.UkOrderProcessor;
import com.sbapp.api.rest.service.customerorder.processor.UsaOrderProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Route builder for each country
 */
@Component
public class CountryRouteBuilder extends RouteBuilder {

    @Autowired
    UkOrderProcessor ukOrderProcessor;
    @Autowired
    UsaOrderProcessor usaOrderProcessor;
    @Autowired
    DefaultOrderProcessor defaultOrderProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:orderUK").process(ukOrderProcessor);
        from("direct:orderUSA").process(usaOrderProcessor);
        from("direct:orderDefault").process(defaultOrderProcessor);
    }
}
