package com.nadhem.fruits.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fruit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idFruit;
private String nomFruit;
private Double prixFruit;
private Double poidsFruit;
private Date datePaiement;
public Fruit() {
super();
}
public Fruit(String nomFruit, Double prixFruit, Double poidsFruit, Date datePaiement) {
super();
this.nomFruit = nomFruit;
this.prixFruit = prixFruit;
this.poidsFruit = poidsFruit;
this.datePaiement = datePaiement;
}
public Long getIdFruit() {
return idFruit;
}
public void setIdFruit(Long idFruit) {
this.idFruit = idFruit;
}
public String getNomFruit() {
return nomFruit;
}
public void setNomFruit(String nomFruit) {
this.nomFruit = nomFruit;
}
public Double getPrixFruit() {
return prixFruit;
}
public void setPrixFruit(Double prixFruit) {
this.prixFruit = prixFruit;
}
public Double getPoidsFruit() {
return poidsFruit;
}
public void setPoidsFruit(Double poidsFruit) {
this.poidsFruit = poidsFruit;
}
public Date getDatePaiement() {
return datePaiement;
}
public void setDatePaiement(Date datePaiement) {
this.datePaiement = datePaiement;
}
@Override
public String toString() {
return "Fruit [idFruit=" + idFruit + ", nomFruit=" +
nomFruit + ", prixFruit=" + prixFruit+ ", poidsFruit=" + poidsFruit
+ ", datePaiement=" + datePaiement + "]";
}
}
