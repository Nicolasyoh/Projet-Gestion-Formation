package com.fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CycleFormation {

	@Id
	@Column(length = 50)
	private String titre;
	@Column(length = 200)
	private String description;
	@Column(name = "Date_debut")
	private String dateDebut;
	@Column(name = "Date_fin")
	private String dateFin;
	private int cout;
	@Column(name = "Liste_apprenants")
	private String listeApprenants;

	public CycleFormation(String titre, String description, String dateDebut, String dateFin, int cout,
			String listeApprenants) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.cout = cout;
		this.listeApprenants = listeApprenants;
	}

	public CycleFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDeb) {
		this.dateDebut = dateDeb;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin2) {
		this.dateFin = dateFin2;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public String getListeApprenants() {
		return listeApprenants;
	}

	public void setListeApprenants(String listeApprenants) {
		this.listeApprenants = listeApprenants;
	}

	@Override
	public String toString() {
		return "CycleFormation [titre=" + titre + ", description=" + description + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", cout=" + cout + ", listeApprenants=" + listeApprenants + "]";
	}

}
