package com.example.kabisa_backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Quote API", version = "1.0", description = "Documentation for quote API v1.0"))
public class KabisaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KabisaBackendApplication.class, args);
    }

}
