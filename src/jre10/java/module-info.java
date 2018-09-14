import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkDefaultConnectionBaseBuilder;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkPropertiesReader;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.eclipselink {
	requires com.jwebmp.guicedpersistence;

	provides PropertiesConnectionInfoReader with EclipseLinkDefaultConnectionBaseBuilder;
	provides PropertiesEntityManagerReader with EclipseLinkPropertiesReader;

}
