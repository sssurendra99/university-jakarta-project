package com.example.calculatorservice;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CalculatorWebServiceImpl implements CalculatorWebService{
    @Override
    public int add(@WebParam(name = "num1") int number1, @WebParam(name = "num2") int number2) {
        return number1 + number2;
    }

    @Override
    public int substract(@WebParam(name = "num1") int number1, @WebParam(name = "num2") int number2) {
        return number1 - number2;
    }
}
