package com.cg.customerbootJpaRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
public class CustomerbootJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerbootJpaRestApplication.class, args);
	}

}
