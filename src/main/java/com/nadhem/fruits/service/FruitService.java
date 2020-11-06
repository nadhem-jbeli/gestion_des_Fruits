package com.nadhem.fruits.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.entities.Vendeur;
public interface FruitService {
Fruit saveFruit(Fruit p);
Fruit updateFruit(Fruit p);
void deleteFruit(Fruit p);
void deleteFruitById(Long id);
Fruit getFruit(Long id);
List<Fruit> getAllFruits();
List<Fruit> findByNomFruit(String nom);
List<Fruit> findByNomFruitContains(String nom);
List<Fruit> findByNomPrix (String nom, Double prix);
List<Fruit> findByVendeur (Vendeur vendeur);
List<Fruit> findByVendeurIdVend(Long id);
List<Fruit> findByOrderByNomFruitAsc();
List<Fruit> trierFruitsNomsPrix();
Page<Fruit> getAllFruitsParPage(int page, int size);
}
