package com.nadhem.fruits.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.entities.Vendeur;
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


	@Override
	public Page<Fruit> getAllFruitsParPage(int page, int size) {
		// TODO Auto-generated method stub
		return fruitRepository.findAll(PageRequest.of(page, size));
	}
	
	@Override
	public List<Fruit> findByNomFruit(String nom) {
		return fruitRepository.findByNomFruit(nom);
	}
	@Override
	public List<Fruit> findByNomFruitContains(String nom) {
		return fruitRepository.findByNomFruitContains(nom);
	}
	@Override
	public List<Fruit> findByNomPrix(String nom, Double prix) {
		return fruitRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Fruit> findByVendeur(Vendeur vendeur) {
		return fruitRepository.findByVendeur(vendeur);
	}
	/*@Override
	public List<Fruit> findByVendeurIdVend(Long id) {
		return fruitRepository.findByVendeurIdVend(id);
	}*/
	@Override
	public List<Fruit> findByOrderByNomFruitAsc() {
		return fruitRepository.findByOrderByNomFruitAsc();
	}
	@Override
	public List<Fruit> trierFruitsNomsPrix() {
		return fruitRepository.TrierFruitsNomsPrix();
	}
	
}