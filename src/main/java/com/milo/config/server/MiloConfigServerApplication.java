package com.milo.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MiloConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiloConfigServerApplication.class, args);
    }

}
