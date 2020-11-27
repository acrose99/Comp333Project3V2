package com.company.hr;//equivalent to Employee.java, EmployeeRepresentation.java


import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class Product {
	private String partnerId;
	private String name;
	private String photoURL;
	private String description;
	
	public String getProductID() {
		return partnerId;
	}

	public void setProductID(String partnerId) {
		this.partnerId = partnerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoUrl(String name) {
		this.photoURL = photoURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String name) {
		this.description = name;
	}

}
