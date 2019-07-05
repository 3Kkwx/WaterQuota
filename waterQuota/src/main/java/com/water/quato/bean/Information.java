package com.water.quato.bean;

import java.io.Serializable;

public class Information implements Serializable{
    
	private int id;
	private String inName;
	private int inAge;
	private String inAddress;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getInName() {
		return inName;
	}


	public void setInName(String inName) {
		this.inName = inName;
	}


	public int getInAge() {
		return inAge;
	}


	public void setInAge(int inAge) {
		this.inAge = inAge;
	}


	public String getInAddress() {
		return inAddress;
	}


	public void setInAddress(String inAddress) {
		this.inAddress = inAddress;
	}


	@Override
	public String toString() {
		return "Information [id=" + id + ", inName=" + inName + ", inAge=" + inAge + ", inAddress=" + inAddress + "]";
	}

}
