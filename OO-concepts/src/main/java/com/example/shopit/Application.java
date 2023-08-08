package com.example.shopit;

import com.example.shopit.bill.Billing;
import com.example.shopit.bill.BillingImpl;
import com.example.shopit.pm.PriceMatrix;
import com.example.shopit.pm.PriceMatrixV1;
import com.example.shopit.pm.PriceMatrixV2;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {

//        PriceMatrix priceMatrixV1=new PriceMatrixV1();
//        PriceMatrix priceMatrixV2=new PriceMatrixV2();
//        Billing billing = new BillingImpl(priceMatrixV2);

        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Application.class);

        Billing billing = applicationContext.getBean(Billing.class);
        String[] cart1 = {"123", "456", "789"};
        double totalPrice = billing.getTotalPrice(cart1);
        System.out.println(totalPrice);

        String[] cart2 = {"123", "456"};
        totalPrice = billing.getTotalPrice(cart2);
        System.out.println(totalPrice);
    }
}
