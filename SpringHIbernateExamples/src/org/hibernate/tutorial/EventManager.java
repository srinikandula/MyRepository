package org.hibernate.tutorial;

import org.hibernate.Session;
import java.util.*;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.domain.Person;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {
	public static void main(String[] args) {
		EventManager mgr = new EventManager();

		//mgr.createAndStoreEvent("My Event", new Date());
		Person p = mgr.createAndStorePerson("Srini", "Kandula", 20);
		//mgr.addEmailToPerson(p.getId(), "emailAddress");
		mgr.addEmailToPerson(p, "emailAddress");
		HibernateUtil.getSessionFactory().close();
	}

	

	private void createAndStoreEvent(String title, Date theDate) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event theEvent = new Event();
		theEvent.setTitle(title);
		theEvent.setDate(theDate);
		session.save(theEvent);
		session.getTransaction().commit();
	}
	private Person createAndStorePerson(String fName,String lName,int age) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Person thePerson = new Person();
		thePerson.setAge(age);
		thePerson.setFirstname(fName);
		thePerson.setLastname(lName);
		session.save(thePerson);
		session.getTransaction().commit();
		return thePerson;
	}

	private List listEvents() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Event").list();
		session.getTransaction().commit();
		return result;
	}

	private void addEmailToPerson(int i, String emailAddress) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Person aPerson = (Person) session.get(Person.class, i);
		Person bPerson = (Person) session.load(Person.class, i);
		System.out.println(bPerson.getId());
		// adding to the emailAddress collection might trigger a lazy load of
		// the collection
		aPerson.getEmailAddresses().add(emailAddress);
		session.getTransaction().commit();
	}
	private void addEmailToPerson(Person bPerson, String emailAddress) {
		try{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println(bPerson.getId());
		bPerson.getEmailAddresses().add(emailAddress);
		session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}