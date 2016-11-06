package com.abderrahmen.onetoone.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abderrahmen.onetoone.entities.Person;
import com.abderrahmen.onetoone.entities.Vehicle;

public class TestOneToOne {

	
	public static void main(String... args){
		
		 SessionFactory sessionFactory;
		  sessionFactory = new Configuration().configure().buildSessionFactory();

		  Session session = sessionFactory.openSession();

		  Transaction tx = session.beginTransaction();

		  Vehicle v1=new Vehicle();
		  v1.setVehicleName("WW");
		  
		  
		  Person p = new Person();
		  p.setFirstName("ali");
		  p.setLastName("Ben Saleh");
	
		  p.setVehicle(v1);
		  
		  session.save(v1);
		  session.save(p);
		  tx.commit();
		  session.close();
		
   }

}
