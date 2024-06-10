package com.example.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "injectedconfig")
@Getter @Setter
public class ApplicationConfig {

    private int ageMultiplier;
    private String defaultDescription;

}