package com.vrx.currency.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CurrencyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConfigApplication.class, args);
	}

}
