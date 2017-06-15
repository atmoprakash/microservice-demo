package com.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EuerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuerkaServerApplication.class, args);

    }
}
