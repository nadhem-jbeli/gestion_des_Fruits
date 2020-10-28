package com.nadhem.fruits;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.service.FruitService;

@SpringBootApplication
public class FruitsApplication implements CommandLineRunner {
@Autowired
FruitService fruitService;
public static void main(String[] args) {
SpringApplication.run(FruitsApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
fruitService.saveFruit(new Fruit("pomme", 2600.0,50.0, new Date()));
fruitService.saveFruit(new Fruit("orange", 2800.0,50.0, new Date()));
fruitService.saveFruit(new Fruit("fraise", 900.0,50.0, new Date()));
}
}

