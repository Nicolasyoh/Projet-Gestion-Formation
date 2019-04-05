package com.fr.adaming.entities;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fr.adaming.Interfaces.IGestion;

public class ConService  implements IGestion{

public void add(Object O, Session session){
	
	Transaction t = session.beginTransaction(); 
		Consultant consultant = new Consultant(((Personne) O).getDateNaissance(),((Personne) O).getNom(),((Personne) O).getPrenom(),((Consultant) O).getSpecialite(),((Consultant) O).getNbrFormationDispo());
		session.persist(consultant);
		t.commit();
	}
	

	public void delete(Session session,String nom){
		Transaction t = session.beginTransaction();
		Criteria cr=session.createCriteria(Consultant.class);
		cr.add(Restrictions.eq("nom",nom));
		List result=cr.list();
		session.delete(result.get(0));
		t.commit();
	}


	@Override
	public void consult(Session session){
		Transaction t = session.beginTransaction(); 
		Criteria cr = session.createCriteria(Consultant.class);
		List results = cr.list();
		System.out.println(results);
		}
		

	@Override
	public void search(Session session,String nom) {
		Transaction t = session.beginTransaction();
		Criteria cr = session.createCriteria(Consultant.class);
		cr.add(Restrictions.like("nom", nom+"%"));
		List results = cr.list();
		System.out.println(results);
	}

	@Override
	public String toString() {
		return "ConService []";
	}
	
}