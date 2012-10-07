
package com.samples.divya;

import java.io.*;
import java.sql.*;

import org.postgresql.*;

public class Employee {
	
	
	    
public	Employee(){
	
	}
	int     id;
	public int getId() {
	return id;
}
	String firstname;
	String lastname;
	String  address;
	String  street;
	String  city;
	String  state;
	
	public Employee(int id, String fn, String ln, String add, String st, String city, String state) {
	    
		this.id = id;
	    this.firstname = fn;
	    this.lastname = ln;
	    this.address = add;
	    this.street =st;
	    this.city= city;
	    this.state= state;
	    
	}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstname;
}

public void setFirstName(String firstName) {
	this.firstname = firstName;
}

public String getLastName() {
	return lastname;
}

public void setLastName(String lastName) {
	this.lastname = lastName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

	}
	
