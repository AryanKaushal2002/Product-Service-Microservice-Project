package com.aryan.rapidretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RapidRetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(RapidRetailApplication.class, args);
    }

}
