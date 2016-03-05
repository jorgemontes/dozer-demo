package com.jorge.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerMapperXML {

	public static PersonBBeanXML mapPerson(PersonABeanXML personA) {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		Mapper mapper = new DozerBeanMapper(myMappingFiles);
		return mapper.map(personA, PersonBBeanXML.class);
		
	}
}
