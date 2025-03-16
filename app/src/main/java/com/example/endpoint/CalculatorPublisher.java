package com.example.endpoint;

import jakarta.xml.ws.Endpoint;
import com.example.calculatorservice.*;;

public class CalculatorPublisher {
    public static void main(String[] args) {
        System.out.println("Publishing Calculator Service...");
        Endpoint.publish("http://localhost:8088/calculator", new CalculatorWebServiceImpl());
        System.out.println("Calculator Service Published. WSDL available at: http://localhost:8088/calculator?wsdl");
    }
}
