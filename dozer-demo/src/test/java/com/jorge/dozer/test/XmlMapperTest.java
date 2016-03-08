package com.jorge.dozer.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.jorge.dozer.DozerMapperXML;
import com.jorge.dozer.PersonABeanXML;
import com.jorge.dozer.PersonBBeanXML;

public class XmlMapperTest {
	@Test
	public void canMapPerson() throws Exception {
		List<String> emails = new ArrayList<String>();
		emails.add("jorge@gmail.com");
		emails.add("jorge@globant.com");
		emails.add("jorge.montes@gmail.com");
		emails.add("jorge@hotmail.com");
		Set<String> domains = new HashSet<String>();
		domains.add("gmail.com");
		domains.add("globant.com");
		domains.add("hotmail.com");
		PersonABeanXML personA = new PersonABeanXML("jorge", "06/06/2006 18:00:00:00",emails,"suba");
		PersonBBeanXML personB = DozerMapperXML.mapPerson(personA);
		Date dateObj = DateUtils.parseDate("06/06/2006 18:00:00:00", "dd/MM/yyyy HH:mm:ss:SS");
		assertEquals("jorge", personB.getNameCap());
		assertEquals(dateObj, personB.getDateObject());
		assertEquals(domains, personB.getDomains());
		assertEquals("suba", personB.getAddressObj().getAddress());
	}
}
