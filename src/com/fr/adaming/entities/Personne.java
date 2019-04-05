package com.fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_per", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
@Entity
public class Personne {

	@Id
	@Column(name = "Date_naissance", length = 45)
	private String dateNaissance;
	@Column(length = 45)
	private String nom;
	@Column(length = 45)
	private String prenom;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(String dateNaissance, String nom, String prenom) {
		super();
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
