package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
	private int eid;
	private String ename;
	private long mono;
	
	@ManyToOne
	private Department dept;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mono=" + mono + ", dept=" + dept + "]";
	}
	public Employee(int eid, String ename, long mono) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mono = mono;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Id
//	private int eid;
//	private String ename;
//	private long mono;
//	@OneToOne(cascade = CascadeType.ALL)
//	private Laptop Lap;
//	
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", mono=" + mono + ", Lap=" + Lap + "]";
//	}
//
//	public int getEid() {
//		return eid;
//	}
//
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//
//	public long getMono() {
//		return mono;
//	}
//
//	public void setMono(long mono) {
//		this.mono = mono;
//	}
//
//	public Laptop getLap() {
//		return Lap;
//	}
//
//	public void setLap(Laptop lap) {
//		Lap = lap;
//	}
}
