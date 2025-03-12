package org.mccaeano.financestocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FinancestocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancestocksApplication.class, args);
	}

}
