package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DyPune extends DyPatil{
   
	private boolean HostelFacility;

	@Override
	public String toString() {
		return "DyPune [HostelFacility=" + HostelFacility + "]";
	}

	public boolean isHostelFacility() {
		return HostelFacility;
	}

	public void setHostelFacility(boolean hostelFacility) {
		HostelFacility = hostelFacility;
	}
	
  
  
}
