package com.jorge.dozer.converters;

import org.dozer.CustomConverter;

public class CompleteNameConverter implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if (sourceFieldValue == null) {
			return null;
		}
		String completeName = null;
		if (sourceFieldValue instanceof String) {
			if (existingDestinationFieldValue == null) {
				completeName = (String) sourceFieldValue;
			} else {
				completeName = (String) existingDestinationFieldValue + " " + (String) sourceFieldValue;
			}
			return completeName;
		}
		return null;
	}

}
