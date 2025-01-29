package com.model;

import java.io.Serializable;
import java.util.Objects;

public class StudentId implements Serializable{
	
	private int studentid;
	private int instituteid;
	public StudentId(int studentid, int instituteid) {
		
		this.studentid = studentid;
		this.instituteid = instituteid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(instituteid, studentid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentId other = (StudentId) obj;
		return instituteid == other.instituteid && studentid == other.studentid;
	}

}

