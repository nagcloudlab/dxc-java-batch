package com.example.shopit.pm;

import org.springframework.stereotype.Component;

@Component
public class PriceMatrixV2 implements PriceMatrix {

    public double getPrice(String item){
        //...
        return 200.00;
    }

}
