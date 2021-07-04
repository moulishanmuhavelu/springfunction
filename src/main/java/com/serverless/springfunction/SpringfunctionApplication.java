package com.serverless.springfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> myTestFunction() {
		return input -> "Hello " + input;
	}

	@Bean
	public Consumer<String> myTestConsumer() {
		return input -> System.out.println(input);
	}

	@Bean
	public Supplier<String> myTestSupplier() {
		return () -> "Hello world!";
	}
}