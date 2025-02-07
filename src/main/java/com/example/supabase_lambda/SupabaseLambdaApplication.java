package com.example.supabase_lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.example.supabase_lambda.domain",
		"com.example.supabase_lambda.application",
		"com.example.supabase_lambda.infrastructure"
})
@EnableJpaRepositories(basePackages = "com.example.supabase_lambda.domain.repository")
@EntityScan(basePackages =  "com.example.supabase_lambda.domain.model")
public class SupabaseLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupabaseLambdaApplication.class, args);
	}

}
