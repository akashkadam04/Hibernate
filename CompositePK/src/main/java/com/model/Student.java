package com.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Student {
    @EmbeddedId
	private StudentId studentid;
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", mono=" + mono + "]";
	}
	public StudentId getStudentid() {
		return studentid;
	}
	public void setStudentid(StudentId studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	private String name;
	private long mono;
	
}
