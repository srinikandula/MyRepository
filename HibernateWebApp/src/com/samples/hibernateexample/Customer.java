package com.samples.hibernateexample;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author tunatore
 */

@Entity
@Table(name = "CUSTOMER") //reference for the table inside Database
public class Customer implements Serializable{

    @Id //Colum CUSTOMER_ID inside database will be mapped to customer_ID
    @Column(name = "CUSTOMER_ID")
    private int id;
    
	//Colum NAME inside database will be mapped to customer_ID
    @Column(name = "NAME")
    private String name;
    //Colum CITY inside database will be mapped to city
    @Column(name = "CITY")
    private String city;
    //Colum STATE inside database will be mapped to state
    @Column(name = "STATE")
    private String state;
    /**
     * @return the customer_ID
     */
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
/**
     * @return the state
     */
    public String getState() {
        return state;
    }
/**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

}