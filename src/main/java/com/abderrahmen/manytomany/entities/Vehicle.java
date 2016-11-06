package com.abderrahmen.manytomany.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idVehicle;
	@Column(name = "VEHICLE_NAME", nullable = false)
	private String vehicleName;
	
	//Si mappedBy n'est pas pésent, on aura deux tables de mapping qui contiennent presque la même chose
	@ManyToMany(mappedBy="vehicles")
	private Collection<Person> persons;
	

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}

	public long getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(long idVehicle) {
		this.idVehicle = idVehicle;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
