package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
	private double price;
	@OneToOne
	private Employee Emp;
   
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Employee getEmp() {
		return Emp;
	}

	public void setEmp(Employee emp) {
		Emp = emp;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", price=" + price + ", Emp=" + Emp + "]";
	}
	
}
