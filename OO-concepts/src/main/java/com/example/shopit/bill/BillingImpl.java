package com.example.shopit.bill;


import com.example.shopit.pm.PriceMatrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BillingImpl implements Billing {

    private PriceMatrix priceMatrix;

    @Autowired
    public BillingImpl(@Qualifier("priceMatrixV1") PriceMatrix priceMatrix) {
        this.priceMatrix = priceMatrix;
    }

    @Override
    public double getTotalPrice(String[] cart) {
        double totalPrice = 0.0;
        for (String cartItem : cart) {
            totalPrice += priceMatrix.getPrice(cartItem);
        }
        return totalPrice;
    }

}
