package com.jwebmp.guicedpersistence.readers.eclipselink;

import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EclipseLinkPropertiesReader
		implements PropertiesEntityManagerReader
{
	@Override
	public Map<String, String> processProperties(PersistenceUnit persistenceUnit, Properties incomingProperties)
	{
		Map<String, String> output = new HashMap<>();
		output.putIfAbsent("eclipselink.weaving", "static");
		return output;
	}
}
