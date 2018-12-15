package com.jwebmp.guicedpersistence.readers.eclipselink;

import com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EclipseLinkIPropertiesReader
		implements IPropertiesEntityManagerReader
{
	@Override
	public Map<String, String> processProperties(PersistenceUnit persistenceUnit, Properties incomingProperties)
	{
		Map<String, String> output = new HashMap<>();
		output.putIfAbsent("eclipselink.weaving", "static");
		return output;
	}
}
