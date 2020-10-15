package com.nadhem.fruits;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.repos.FruitRepository;
@SpringBootTest
class FruitsApplicationTests {
@Autowired
private FruitRepository fruitRepository;
@Test
public void testCreateFruit() {
Fruit fr = new Fruit("pomme",4200.500,5.0,new Date());
fruitRepository.save(fr);
}
@Test
public void testFindFruit()
{
Fruit f = fruitRepository.findById(1L).get();
System.out.println(f);
}
@Test
public void testUpdateFruit()
{
Fruit f = fruitRepository.findById(1L).get();
f.setPrixFruit(1000.0);
fruitRepository.save(f);
}
@Test
public void testDeleteFruit()
{
fruitRepository.deleteById(1L);;
}

@Test
public void testListerTousFruits()
{
List<Fruit> frs = fruitRepository.findAll();
for (Fruit f : frs)
{
System.out.println(f);
}
}

}
