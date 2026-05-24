package org.tech.jpa.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {


    @Bean
    public OpenAPI openAPI() {
        // http://localhost:8080/tech-jpa-singleDb/swagger-ui/index.html
        return new OpenAPI()
                .info(new Info().title("SpringBoot Jpa Test")
                        .description("SpringBoot Jpa Test Swagger debugging")
                        .version("v1"));
    }
}