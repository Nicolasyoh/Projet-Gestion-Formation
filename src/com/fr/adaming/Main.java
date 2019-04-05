package com.fr.adaming;

import java.util.Scanner;

import org.hibernate.Session;

import com.fr.adaming.entities.AppService;
import com.fr.adaming.entities.Apprenant;
import com.fr.adaming.entities.ConService;
import com.fr.adaming.entities.ConnBDD;
import com.fr.adaming.entities.Consultant;
import com.fr.adaming.entities.CycleFormation;
import com.fr.adaming.entities.ForService;

public class Main {

	public static ConService ConServ = new ConService();
	public static AppService AppServ = new AppService();
	public static ForService ForServ = new ForService();

	public static void main(String[] args) {
		Session globalconn = null;
		globalconn = ConnBDD.getConnection();

		System.out.println(
				"Bienvenue dans nos services. Choisissez l'action à effectuer : \n1 : Gestion des consultants.\n2 : Gestion des apprenants.\n3 : Gestion des cycles de formations.\n4 : Quitter le programme.");
		Scanner sc = new Scanner(System.in);
		int action1 = sc.nextInt();
		switch (action1) {
		case 1:
			System.out.println(
					"Gestion des consultants\nChoisir l'action a effectuer\n1 : Ajouter un consultant.\n2 : Supprimer un consultant.\n3 : Consulter la liste des consultants.\n4 : Rechercher un consultant.");
			Scanner sc1 = new Scanner(System.in);
			int action2 = sc1.nextInt();
			switch (action2) {
			case 1:
				System.out.println("Entrez la date de naissance");
				Scanner sc10 = new Scanner(System.in);
				String date = sc10.nextLine();
				System.out.println("Entrez le nom");
				String nom = sc10.nextLine();
				System.out.println("Entrez le prenom");
				String prenom = sc10.nextLine();
				System.out.println("Entrez la specialité");
				String specialite = sc10.nextLine();
				System.out.println("Entrez le nombre de Formation Disponibles");
				int heureForm = sc10.nextInt();
				Consultant consultant = new Consultant();
				consultant.setDateNaissance(date);
				consultant.setNom(nom);
				consultant.setPrenom(prenom);
				consultant.setSpecialite(specialite);
				consultant.setNbrFormationDispo(heureForm);
				ConServ.add(consultant, globalconn);
				main(null);
				break;
			case 2:
				System.out.println("Entrez le nom de la personne que vous voulez supprimer.");
				Scanner sc20 = new Scanner(System.in);
				String nomDelete = sc20.nextLine();
				ConServ.delete(globalconn, nomDelete);
				main(null);
				break;
			case 3:
				ConServ.consult(globalconn);
				main(null);
				break;
			case 4:
				System.out.println("Entrez le nom de la personne que vous voulez consulter.");
				Scanner sc40 = new Scanner(System.in);
				String nomChercher = sc40.nextLine();
				ConServ.search(globalconn, nomChercher);
				main(null);
				break;
			default:
				System.out.println("Entrez une valeur entre 1 et 4 svp.");
			}
			main(null);
			break;
		case 2:

			System.out.println(
					"Gestion des apprenants\nChoisir l'action a effectuer\n1 : Ajouter un apprenant.\n2 : Supprimer un apprenant.\n3 : Consulter la liste des apprenants.\n4 : Rechercher un apprenant.");
			Scanner sc2 = new Scanner(System.in);
			int action3 = sc2.nextInt();
			switch (action3) {
			case 1:
				System.out.println("Entrez la date de naissance");
				Scanner sc11 = new Scanner(System.in);
				String date = sc11.nextLine();
				System.out.println("Entrez le nom");
				String nom = sc11.nextLine();
				System.out.println("Entrez le prenom");
				String prenom = sc11.nextLine();
				System.out.println("Entrez le diplome");
				String diplome = sc11.nextLine();
				System.out.println("Entrez le cv");
				String cv = sc11.nextLine();
				System.out.println("Entrez le cycle de formation");
				String cycleForm = sc11.nextLine();
				Apprenant apprenant = new Apprenant();
				apprenant.setDateNaissance(date);
				apprenant.setNom(nom);
				apprenant.setPrenom(prenom);
				apprenant.setDiplome(diplome);
				apprenant.setCv(cv);
				apprenant.setCycleFormation(cycleForm);
				AppServ.add(apprenant, globalconn);
				main(null);
				break;
			case 2:
				System.out.println("Entrez le nom de la personne que vous voulez supprimer.");
				Scanner sc21 = new Scanner(System.in);
				String nomDelete = sc21.nextLine();
				AppServ.delete(globalconn, nomDelete);
				main(null);
				break;
			case 3:
				AppServ.consult(globalconn);
				main(null);
				break;
			case 4:
				System.out.println("Entrez le nom de la personne que vous voulez consulter.");
				Scanner sc41 = new Scanner(System.in);
				String nomChercher = sc41.nextLine();
				AppServ.search(globalconn, nomChercher);
				main(null);
				break;
			default:
				System.out.println("Entrez une valeur entre 1 et 4 svp.");
			}
			main(null);
			break;
		case 3:
			System.out.println(
					"Gestion des cycles de formation\nChoisir l'action a effectuer\n1 : Ajouter un cycle de formation.\n2 : Supprimer un cycle de formation.\n3 : Consulter la liste des cycles de formation.\n4 : Rechercher une formation.");
			Scanner sc3 = new Scanner(System.in);
			int action4 = sc3.nextInt();
			switch (action4) {
			case 1:
				System.out.println("Entrez un titre");
				Scanner sc12 = new Scanner(System.in);
				String titre = sc12.nextLine();
				System.out.println("Entrez la description");
				String desc = sc12.nextLine();
				System.out.println("Entrez la date de début");
				String dateDeb = sc12.nextLine();
				System.out.println("Entrez la date de fin");
				String dateFin = sc12.nextLine();
				System.out.println("Entrez le coût");
				int cout = sc12.nextInt();
				CycleFormation cyclefor = new CycleFormation();
				cyclefor.setTitre(titre);
				cyclefor.setDescription(desc);
				cyclefor.setDateDebut(dateDeb);
				cyclefor.setDateFin(dateFin);
				cyclefor.setCout(cout);
				ForServ.add(cyclefor, globalconn);
				main(null);
				break;
			case 2:
				System.out.println("Entrez le nom de la personne que vous voulez supprimer.");
				Scanner sc22 = new Scanner(System.in);
				String nomDelete = sc22.nextLine();
				ForServ.delete(globalconn, nomDelete);
				main(null);
				break;
			case 3:
				ForServ.consult(globalconn);
				main(null);
				break;
			case 4:
				System.out.println("Entrez le nom de la personne que vous voulez consulter.");
				Scanner sc42 = new Scanner(System.in);
				String nomChercher = sc42.nextLine();
				ForServ.search(globalconn, nomChercher);
				main(null);
				break;
			default:
				System.out.println("Entrez une valeur entre 1 et 4 svp.");
				main(null);
			}
			main(null);
			break;
		case 4:
			System.out.println("Sortie du programme. Merci de votre visite.");
			System.exit(0);
		default:
			System.out.println("Entrez une valeur entre 1 et 4 svp.");
			main(null);
		}

	}

}
