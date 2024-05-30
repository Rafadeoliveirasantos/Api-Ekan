package com.example.Api_Ekan.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Documentation")
                        .description("API_Ekan")
                        .contact(new Contact().name("Rafael Santos").email("rafadeoliveirasantos@hotmail.com"))
                        .version("1.0.0"));

    }

}
