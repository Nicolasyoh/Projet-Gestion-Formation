package com.fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Consultant extends Personne {
	
	@Column(length=50)
	private String specialite;
	@Column(name = "Nombre_formation_disponible")
	private int nbrFormationDispo;
	public Consultant(String dateNaissance, String nom, String prenom, String specialite, int nbrFormationDispo) {
		super(dateNaissance, nom, prenom);
		this.specialite = specialite;
		this.nbrFormationDispo = nbrFormationDispo;
	}
	public Consultant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public int getNbrFormationDispo() {
		return nbrFormationDispo;
	}

	public void setNbrFormationDispo(int nbrFormationDispo) {
		this.nbrFormationDispo = nbrFormationDispo;
	}
	@Override
	public String toString() {
		return "Consultant [DateNaissance=" + getDateNaissance() + ", Nom=" + getNom() + ", Prenom="
				+ getPrenom() + ", specialite=" + specialite + ", nbrFormationDispo=" + nbrFormationDispo + "]";
	}

	
}
