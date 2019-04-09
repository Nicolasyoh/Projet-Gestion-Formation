package com.fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@DiscriminatorValue("2")
@Entity
public class Apprenant extends Personne {

	@Column(length = 50)
	private String diplome;
	@Column(length = 500)
	private String cv;
	@Column(name = "Cycle_formation", length = 50)
	private String cycleFormation;

	
	public Apprenant(String diplome, String cv, String cycleFormation) {
		super();
		this.diplome = diplome;
		this.cv = cv;
		this.cycleFormation = cycleFormation;
	}

	public Apprenant(String dateNaissance, String nom, String prenom, String diplome, String cv,
			String cycleFormation) {
		super(dateNaissance, nom, prenom);
		this.diplome = diplome;
		this.cv = cv;
		this.cycleFormation = cycleFormation;
	}

	public Apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getCycleFormation() {
		return cycleFormation;
	}

	public void setCycleFormation(String cycleFormation) {
		this.cycleFormation = cycleFormation;
	}

	@Override
	public String toString() {
		return "Apprenant [DateNaissance=" + getDateNaissance() + ", Nom=" + getNom() + ", Prenom=" + getPrenom()
				+ ", diplome=" + diplome + ", cv=" + cv + ", cycleFormation=" + cycleFormation + "]";
	}

}
