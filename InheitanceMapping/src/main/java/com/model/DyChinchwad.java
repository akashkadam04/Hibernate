package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DyChinchwad extends DyPatil{
    

	public boolean isBusFacility() {
		return busFacility;
	}

	@Override
	public String toString() {
		return "DyChinchwad [busFacility=" + busFacility + "]";
	}

	public void setBusFacility(boolean busFacility) {
		this.busFacility = busFacility;
	}

	private boolean busFacility;
	
}
