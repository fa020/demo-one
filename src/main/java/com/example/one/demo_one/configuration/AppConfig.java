package com.example.one.demo_one.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.one.demo_one.DB;
import com.example.one.demo_one.ProdDB;

@Configuration
public class AppConfig {
    @Bean
    public DB getDBBean() {
        return new ProdDB();
    }
}
