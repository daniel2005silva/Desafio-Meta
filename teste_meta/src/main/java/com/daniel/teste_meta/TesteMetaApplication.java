package com.daniel.teste_meta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TesteMetaApplication {

	@Bean
	public WebClient webClientPaises(WebClient.Builder builder) {
		return builder
				.baseUrl("http://api.worldbank.org/v2/country")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}

	public static void main(String[] args) {

		SpringApplication.run(TesteMetaApplication.class, args);

	}

}
