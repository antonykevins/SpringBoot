package com.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity						
public class User {			
	//To Maintain PPS Number as a Primary Key
	@Id
	private String pps;
	
	//Other validated data about the user
	@NotNull
	private String name;
	private String dob;
	private String phone;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPps() {
		return pps;
	}
	public void setPps(String pps) {
		this.pps = pps;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public User() {
		super();
	}
	public User( String name, String pps, String dob, String phone) {
		super();
		
		this.name = name;
		this.pps = pps;
		this.dob = dob;
		this.phone = phone;
	}
}
