package com.pes.Mylab2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	
	private int cid;
	private String cName;
	private String email;
	private String city;
	private long phone;
	public int getCid() {
		return cid;
	}
	
	public Customer() {
		super();
	}

	public Customer(int cid, String cName, String email, String city, long phone) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.email = email;
		this.city = city;
		this.phone = phone;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}