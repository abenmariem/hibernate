package com.abderrahmen.onetomany.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abderrahmen.onetomany.entities.Person;
import com.abderrahmen.onetomany.entities.Vehicle;

public class TestOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory sessionFactory;
		  sessionFactory = new Configuration().configure().buildSessionFactory();

		  Session session = sessionFactory.openSession();

		  Transaction tx = session.beginTransaction();

		  Vehicle v1=new Vehicle();
		  v1.setVehicleName("WW");
		  
		  
		  List<Vehicle> vehicles = new ArrayList<>();
		  vehicles.add(v1);
		  
		  Person p = new Person();
		  p.setFirstName("ali");
		  p.setLastName("Ben Saleh");
	
		  p.setVehicles(vehicles);
		  
		  v1.setPerson(p);
		  
		  session.save(p);
		  session.save(v1);
		  
		  tx.commit();
		  session.close();
	}

}
