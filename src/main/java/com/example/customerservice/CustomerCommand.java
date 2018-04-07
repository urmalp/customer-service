package com.example.customerservice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomerCommand implements ApplicationRunner {

    private final CustomerRepo repo;

    public CustomerCommand(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public void run(ApplicationArguments args) {
        Arrays.asList("Prateek","Ira","Isha")
        .forEach( name -> {
            repo.save(new Customer(name));
        });

        repo.findAll().forEach(System.out::println);
    }
}
