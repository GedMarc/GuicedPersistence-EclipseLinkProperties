import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkDefaultConnectionBaseBuilder;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;

module com.jwebmp.guicedpersistence.readers.eclipselink {
	requires com.jwebmp.guicedpersistence;

	provides PropertiesConnectionInfoReader with EclipseLinkDefaultConnectionBaseBuilder;
}
