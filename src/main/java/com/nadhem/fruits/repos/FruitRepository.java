package com.nadhem.fruits.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nadhem.fruits.entities.Fruit;
public interface FruitRepository extends JpaRepository<Fruit, Long> {
}