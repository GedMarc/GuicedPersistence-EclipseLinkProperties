package com.jwebmp.guicedpersistence.readers.eclipselink;

import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.Properties;

/**
 * A default connection string builder for H2 Databases
 */
public class EclipseLinkDefaultConnectionBaseBuilder
		implements PropertiesConnectionInfoReader
{
	/**
	 * @see com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader#populateConnectionBaseInfo(PersistenceUnit, Properties, ConnectionBaseInfo)
	 */
	@Override
	public ConnectionBaseInfo populateConnectionBaseInfo(PersistenceUnit unit, Properties filteredProperties, ConnectionBaseInfo cbi)
	{
		for (String prop : filteredProperties.stringPropertyNames())
		{
			switch (prop)
			{
				case "eclipselink.jdbc.url":
				{
					cbi.setUrl(filteredProperties.getProperty(prop));
					break;
				}
				case "eclipselink.jdbc.user":
				{
					cbi.setUsername(filteredProperties.getProperty(prop));
					break;
				}
				case "eclipselink.jdbc.password":
				{
					cbi.setPassword(filteredProperties.getProperty(prop));
					break;
				}
				case "eclipselink.jdbc.driver":
				{
					cbi.setDriverClass(filteredProperties.getProperty(prop));
					break;
				}
				default:
				{
					break;
				}
			}
		}
		return cbi;
	}
}
