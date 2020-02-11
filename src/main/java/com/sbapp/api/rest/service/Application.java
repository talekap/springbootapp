package com.sbapp.api.rest.service;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.sbapp.api.rest.service")
public class Application {

    @Autowired
    CamelContext camelContext;

    @Autowired
    private ApplicationContext applicationContext;

    @Bean(name = "jsonProvider")
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
