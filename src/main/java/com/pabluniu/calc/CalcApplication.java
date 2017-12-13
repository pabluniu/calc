package com.pabluniu.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}
}
@Service
public class Calculator {
	int sum(int a, int b){
		return a + b;
	}
}
