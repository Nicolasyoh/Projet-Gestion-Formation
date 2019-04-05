package com.fr.adaming.entities;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.fr.adaming.Interfaces.IGestion;

public class ForService implements IGestion {

	public void add(Object O, Session session) {

		Transaction t = session.beginTransaction();
		CycleFormation cycleformation = new CycleFormation(((CycleFormation) O).getTitre(),
				((CycleFormation) O).getDescription(), ((CycleFormation) O).getDateDebut(),
				((CycleFormation) O).getDateFin(), ((CycleFormation) O).getCout(),
				((CycleFormation) O).getListeApprenants());
		session.persist(cycleformation);
		t.commit();
	}

	public void delete(Session session, String nom) {
		Transaction t = session.beginTransaction();
		Criteria cr = session.createCriteria(CycleFormation.class);
		cr.add(Restrictions.eq("nom", nom));
		List result = cr.list();
		session.delete(result.get(0));
		t.commit();
	}

	@Override
	public void consult(Session session) {
		Transaction t = session.beginTransaction();
		Criteria cr = session.createCriteria(CycleFormation.class);
		List results = cr.list();
		System.out.println(results);
	}

	@Override
	public void search(Session session, String nom) {
		Transaction t = session.beginTransaction();
		Criteria cr = session.createCriteria(CycleFormation.class);
		cr.add(Restrictions.like("nom", nom + "%"));
		List results = cr.list();
		System.out.println(results);
	}

}