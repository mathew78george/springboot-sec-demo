package com.mathew.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication == @SpringBootConfiguration + @EnableAutoConfiguration +  @ComponentScan*/
@SpringBootApplication
public class SpringbootSecDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecDemoApplication.class, args);
	}
}
