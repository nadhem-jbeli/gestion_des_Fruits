package com.nadhem.fruits.repos;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.entities.Vendeur;

@RepositoryRestResource(path = "rest")
public interface FruitRepository extends JpaRepository<Fruit, Long> {
	 List<Fruit> findByNomFruit(String nom);
	 List<Fruit> findByNomFruitContains(String nom); 
	 @Query("select p from Fruit p where p.nomFruit like %?1 and p.prixFruit > ?2")
	 List<Fruit> findByNomPrix (String nom, Double prix);
	 @Query("select p from Fruit p where p.vendeur = ?1")
	 List<Fruit> findByVendeur (Vendeur vendeur);
	 List<Fruit> findByVendeurIdVend (Long id);
	 List<Fruit> findByOrderByNomFruitAsc();
	 @Query("select f from Fruit f order by f.nomFruit ASC, f.prixFruit DESC")
	 List<Fruit> TrierFruitsNomsPrix ();
}