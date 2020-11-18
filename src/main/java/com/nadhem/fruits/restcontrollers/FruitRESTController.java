package com.nadhem.fruits.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.service.FruitService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class FruitRESTController {
	@Autowired
	FruitService fruitService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Fruit> getAllFruits() {
		return fruitService.getAllFruits();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Fruit getProduitById(@PathVariable("id") Long id) {
		return fruitService.getFruit(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Fruit createProduit(@RequestBody Fruit fruit) {
		return fruitService.saveFruit(fruit);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Fruit updateProduit(@RequestBody Fruit fruit) {
		return fruitService.updateFruit(fruit);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFruit(@PathVariable("id") Long id)
	{
	fruitService.deleteFruitById(id);
	}
	@RequestMapping(value="/frsv/{idVend}",method = RequestMethod.GET)
	public List<Fruit> getFruitsByVendId(@PathVariable("idVend") Long idVend) {
	return fruitService.findByVendeurIdVend(idVend);
	}

}
