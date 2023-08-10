package com.example;

import com.example.service.TransferService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MtsBackendServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=
		SpringApplication.run(MtsBackendServiceApplication.class, args);
//
//		TransferService transferService=applicationContext.getBean(TransferService.class);
//		transferService.transfer(100.00,"111","222");

	}

}
