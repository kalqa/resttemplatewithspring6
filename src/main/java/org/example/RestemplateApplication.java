package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class RestemplateApplication {

    @Autowired
    MainApplicationRunner runner;

    public static void main(String[] args) {
        SpringApplication.run(RestemplateApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void asjdhnasjdhasd() {
        runner.start();
    }

}
