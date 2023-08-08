package com.example.shopit.pm;

import org.springframework.stereotype.Component;

@Component
public class PriceMatrixV1 implements PriceMatrix{

    public double getPrice(String item){
        // logic...
        return 100.00;
    }

}
