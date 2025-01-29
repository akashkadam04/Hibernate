package com.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
    @Id
	private int cid;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, long mono, Set<Product> pSet) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mono = mono;
		this.pSet = pSet;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mono=" + mono + ", pSet=" + pSet + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	public Set<Product> getpSet() {
		return pSet;
	}
	public void setpSet(Set<Product> pSet) {
		this.pSet = pSet;
	}
	private String cname;
	private long mono;
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Product> pSet = new HashSet<Product>();
	
}
