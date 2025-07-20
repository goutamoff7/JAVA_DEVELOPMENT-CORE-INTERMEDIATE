package com.goutam.ATM_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AtmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmProjectApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.goutam.ATM_Project");
		ATM atm = (ATM)applicationContext.getBean("ATM");
		atm.checkPin();

	}

}
