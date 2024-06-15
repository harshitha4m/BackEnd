package com.pes.Mylab2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	
	private int id;
	private String Name;
	private String city;
	private long pno;
	public Employee() 
	{
		super();
	}
	public Employee(int id, String Name,  String city, long pno) {
		super();
		this.id = id;
		this.Name = Name;
		
		this.city = city;
		this.pno = pno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	
	

}
	