package com.fr.adaming.Interfaces;

import org.hibernate.Session;

public interface IGestion {
	public void add(Object O, Session session);

	public void delete(Session session, String nom);

	public void consult(Session session);

	public void search(Session session, String nom);

}
