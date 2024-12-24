package org.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

    @Autowired
    Environment environment;
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        String port = environment.getProperty("server.port","8080");
        System.out.println("=============================");
        System.out.println("Application is running at:");
        System.out.println("http://localhost:" + port );
        System.out.println("=============================");
    }
}
