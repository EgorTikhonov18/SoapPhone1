package com.example.soapPhone.config;



import com.example.soapPhone.service.PhoneServiceImpl;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.xml.ws.Endpoint;

@Configuration
public class WSConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint GetInitialsEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new PhoneServiceImpl());
        endpoint.publish("/ServicePhoneDirectory");
        return endpoint;
    }


}