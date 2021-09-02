package com.techment.ManytoOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle100")
public class Vehicle {
	
	@Id
	int VId;
	String VName;
	
	@ManyToOne
	Owner owner;
	
	

	public int getVId() {
		return VId;
	}

	public void setVId(int vId) {
		VId = vId;
	}

	public String getVName() {
		return VName;
	}

	public void setVName(String vName) {
		VName = vName;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	

	
	
}
