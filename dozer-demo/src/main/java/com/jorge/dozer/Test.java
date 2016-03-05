package com.jorge.dozer;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		PersonABeanXML personA = new PersonABeanXML("jorge");
		PersonBBeanXML personB = DozerMapperXML.mapPerson(personA);
		System.out.println(personB.getNameCap());
	}

}
