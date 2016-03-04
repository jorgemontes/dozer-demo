package com.jorge.dozer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jorge.dozer.DozerMapperXML;
import com.jorge.dozer.PersonABeanXML;
import com.jorge.dozer.PersonBBeanXML;

public class XmlMapperTest {
	@Test
	public void canMapPerson() {
		PersonABeanXML personA = new PersonABeanXML("jorge");
		PersonBBeanXML personB = DozerMapperXML.mapPerson(personA);
		assertEquals("jorge", personB.getNameCap());
	}
}
