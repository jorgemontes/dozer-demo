package com.jorge.dozer.converters;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.dozer.CustomConverter;

public class PersonEmailConverter implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if (sourceFieldValue == null) {
			return null;
		}
		Set<String> set = null;
		if (sourceFieldValue instanceof List) {
			if (existingDestinationFieldValue == null) {
				set = new HashSet<String>();
			} else {
				set = (HashSet<String>) existingDestinationFieldValue;
			}
			for (String email : ((List<String>) sourceFieldValue))
				set.add(StringUtils.substringAfter(email, "@"));
			return set;
		}
		return null;
	}

}
