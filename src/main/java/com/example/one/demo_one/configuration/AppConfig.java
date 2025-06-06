package com.example.one.demo_one.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.one.demo_one.DB;
import com.example.one.demo_one.DevDB;
import com.example.one.demo_one.ProdDB;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "pro")
    public DB getProdDBBean() {
        return new ProdDB();
    }
    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "dev")
    public DB getDevDBBean() {
        return new DevDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
