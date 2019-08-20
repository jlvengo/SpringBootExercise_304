package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarsRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Cars car;
        car = new Cars("2019", "Honda", "Pilote");
        repository.save(car);

        car = new Cars("2018", "Mercedes", "Class 550");
        repository.save(car);

        car = new Cars("2017", "Lambourghini", "Top Level");
        repository.save(car);
    }
}
