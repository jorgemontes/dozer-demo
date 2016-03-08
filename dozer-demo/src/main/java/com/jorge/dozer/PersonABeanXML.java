package com.jorge.dozer;

import java.util.List;

public class PersonABeanXML {
	private String name;
	private String dateString;
	private List<String> emails;
	private String address;

	public PersonABeanXML(String name, String dateString, List<String> emails, String address) {
		super();
		this.name = name;
		this.dateString = dateString;
		this.emails = emails;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
