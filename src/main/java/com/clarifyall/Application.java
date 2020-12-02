package com.clarifyall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clarifyall.config.GlobalProperties;
import com.clarifyall.config.WordpressProperties;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private WordpressProperties wpProperties;

    @Autowired
    private GlobalProperties globalProperties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(globalProperties);
        System.out.println(wpProperties);
    }
}
