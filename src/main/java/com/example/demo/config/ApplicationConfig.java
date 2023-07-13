package com.example.demo.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app.property")
public class ApplicationConfig {
    private String name;
    private String creator;
    private String version;
}