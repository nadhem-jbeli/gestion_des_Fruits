package com.nadhem.fruits.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVend;
	private String nomVend;
	private int telVend;
	@JsonIgnore
	@OneToMany(mappedBy = "vendeur")
	private List<Fruit> fruits;
	
	public Vendeur(String nomVend, int telVend, List<Fruit> fruits)
	{
		super();
		this.nomVend = nomVend;
		this.telVend = telVend;
		this.fruits = fruits;
	}
	public Long getIdVend() {
		return idVend;
	}
	public void setIdVend(Long idVend) {
		this.idVend = idVend;
	}
	public String getNomVend() {
		return nomVend;
	}
	public void setNomVend(String nomVend) {
		this.nomVend = nomVend;
	}
	public int getDescriptionVend() {
		return telVend;
	}
	public void setDescriptionVend(int telVend) {
		this.telVend = telVend;
	}
	public List<Fruit> getFruits() {
		return fruits;
	}
	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "vendeur")
	private List<Fruit> fruit;

}