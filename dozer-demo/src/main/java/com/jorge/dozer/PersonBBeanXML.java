package com.jorge.dozer;

import java.util.Date;
import java.util.Set;

public class PersonBBeanXML {

	private String nameCap;
	private Date dateObject;
	private Set<String> domains;
	private AddressB addressObj;
	private String completeName;

	public PersonBBeanXML() {
		super();
	}

	public PersonBBeanXML(String nameCap) {
		this.nameCap = nameCap;
	}

	public String getNameCap() {
		return nameCap;
	}

	public void setNameCap(String nameCap) {
		this.nameCap = nameCap;
	}

	public Date getDateObject() {
		return dateObject;
	}

	public void setDateObject(Date dateObject) {
		this.dateObject = dateObject;
	}

	public Set<String> getDomains() {
		return domains;
	}

	public void setDomains(Set<String> domains) {
		this.domains = domains;
	}

	public AddressB getAddressObj() {
		return addressObj;
	}

	public void setAddressObj(AddressB addressObj) {
		this.addressObj = addressObj;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

}
