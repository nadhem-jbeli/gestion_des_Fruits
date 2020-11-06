package com.nadhem.fruits;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.entities.Vendeur;
import com.nadhem.fruits.repos.FruitRepository;
import com.nadhem.fruits.service.FruitService;
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
	@Test
	public void testFindByNomFruit()
	{
		List<Fruit> frs = fruitRepository.findByNomFruit("fraise");
		for (Fruit f : frs)
		{
			System.out.println(f);
		}
	}
	@Test
	public void testFindByNomFruitContains ()
	{
		List<Fruit> frs=fruitRepository.findByNomFruitContains("fraise");
		for (Fruit f : frs)
		{
			System.out.println(f);
		}
	}
	
	@Test
	public void testfindByVendeur()
	{
		Vendeur vend = new Vendeur();
		vend.setIdVend(1L);
		List<Fruit> frs = fruitRepository.findByVendeur(vend);
		for (Fruit p : frs)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testfindByOrderByNomFruitAsc()
	{
		List<Fruit> frs = fruitRepository.findByOrderByNomFruitAsc();
		for (Fruit f : frs)
		{
			System.out.println(f);
		}
	}
	
	@Test
	public void testTrierFruitsNomsPrix()
	{
		List<Fruit> frs = fruitRepository.TrierFruitsNomsPrix();
		for (Fruit f : frs)
		{
			System.out.println(f);
		}
	}


	

}
