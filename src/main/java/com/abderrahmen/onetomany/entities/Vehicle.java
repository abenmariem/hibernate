package com.abderrahmen.onetomany.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
@SequenceGenerator(name="VehicleGen",sequenceName="VEHICLE_GEN_SEQ",allocationSize=1)
public class Vehicle {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="VehicleGen")
	@Column(name = "VEHICLE_ID", nullable = false)
	private long idVehicle;
	@Column(name = "VEHICLE_NAME", nullable = false)
	private String vehicleName;
	
	@ManyToOne
	//JoinColumn: la clé étrangère dans la table VEHICLE sera USER_ID
	@JoinColumn(name="USER_ID")
	private Person person;
	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
