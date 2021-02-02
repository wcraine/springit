package com.vega.springit2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class  Springit2Application {

    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);
    public static void main(String[] args)
    {
        SpringApplication.run(Springit2Application.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args-> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
            log.info("CommandLineRunner.run();");
            log.debug("CommandLineRunner.run();");
            log.trace("CommandLineRunner.run();");

        };
    }

}
