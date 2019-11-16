package com.demo.startup.converters;

import com.demo.startup.enums.UserTypes;
import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class UserTypesConverter extends AbstractBeanField<String> {
	protected UserTypes convert(String value) throws CsvDataTypeMismatchException {
		if (value != null) {
			try {
				return UserTypes.valueOf(value);
			} catch (RuntimeException e) {
				throw new CsvDataTypeMismatchException(e.getMessage());
			}
		} else {
			return null;
		}
	}

}
