package com.example.europcar.configuration;

import org.springframework.context.annotation.Bean;

public class SpringFoxConfig {
    @Bean
    public Docket api() { 
        return ((Object) new Docket(DocumentationType.SWAGGER_2)  
          .select())                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}
