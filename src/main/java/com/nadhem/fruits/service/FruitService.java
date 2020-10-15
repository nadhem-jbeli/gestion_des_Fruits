package com.nadhem.fruits.service;
import java.util.List;
import com.nadhem.fruits.entities.Fruit;
public interface FruitService {
Fruit saveFruit(Fruit f);
Fruit updateFruit(Fruit f);
void deleteFruit(Fruit f);
 void deleteFruitById(Long id);
Fruit getFruit(Long id);
List<Fruit> getAllFruits();
}
