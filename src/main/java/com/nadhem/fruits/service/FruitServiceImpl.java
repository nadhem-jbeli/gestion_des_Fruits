package com.nadhem.fruits.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.repos.FruitRepository;
@Service
public class FruitServiceImpl implements FruitService {
@Autowired
FruitRepository fruitRepository;
public Fruit saveFruit(Fruit f) {
return fruitRepository.save(f);
}
public Fruit updateFruit(Fruit f) {
return fruitRepository.save(f);
}
public void deleteFruit(Fruit f) {
fruitRepository.delete(f);
}
 public void deleteFruitById(Long id) {
fruitRepository.deleteById(id);
}
public Fruit getFruit(Long id) {
return fruitRepository.findById(id).get();
}
public List<Fruit> getAllFruits() {
return fruitRepository.findAll();
}
}