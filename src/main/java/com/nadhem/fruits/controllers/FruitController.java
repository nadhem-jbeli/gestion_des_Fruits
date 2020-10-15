package com.nadhem.fruits.controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.nadhem.fruits.entities.Fruit;
import com.nadhem.fruits.service.FruitService;
@Controller
@ComponentScan(basePackages= {"com.nadhem.fruits.controllers"})
public class FruitController {
	@Autowired
	FruitService fruitService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createFruit";
	}
	
	@RequestMapping("/saveFruit")
	public String saveFruit(@ModelAttribute("fruit") Fruit fruit,
	 @RequestParam("date") String date,
	 ModelMap modelMap) throws
	ParseException
	{
		//conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date datePaiement = dateformat.parse(String.valueOf(date));
		 fruit.setDatePaiement(datePaiement);
		
		Fruit saveFruit = fruitService.saveFruit(fruit);
		String msg ="fruit enregistré avec Id "+saveFruit.getIdFruit();
		modelMap.addAttribute("msg", msg);
		return "createFruit";
	}
	
	@RequestMapping("/ListeFruits")
	public String listeFruits(ModelMap modelMap)
	{
		List<Fruit> frs = fruitService.getAllFruits();
		modelMap.addAttribute("fruits", frs);
		return "listeFruits";
	}
	
	@RequestMapping("/supprimerFruit")
	public String supprimerFruit(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
		fruitService.deleteFruitById(id);
		List<Fruit> frs = fruitService.getAllFruits();
		modelMap.addAttribute("fruits", frs);
		return "listeFruits";
	}
	
	@RequestMapping("/modifierFruit")
	public String editerFruit(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Fruit p= fruitService.getFruit(id);
		modelMap.addAttribute("fruit", p);
		return "editerFruit";
	}
	@RequestMapping("/updateFruit")
	public String updateFruit(@ModelAttribute("fruit") Fruit fruit,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		//conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date datePaiement = dateformat.parse(String.valueOf(date));
		 fruit.setDatePaiement(datePaiement);

		 fruitService.updateFruit(fruit);
		 List<Fruit> frs = fruitService.getAllFruits();
		 modelMap.addAttribute("fruits", frs);
		return "listeFruits";
	}

}

