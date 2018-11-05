import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkDefaultConnectionBaseBuilder;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkPropertiesReader;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseModuleExclusions;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.eclipselink {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	provides PropertiesConnectionInfoReader with EclipseLinkDefaultConnectionBaseBuilder;
	provides PropertiesEntityManagerReader with EclipseLinkPropertiesReader;

	provides IGuiceScanModuleExclusions with EclipseModuleExclusions;
	provides IGuiceScanJarExclusions with EclipseModuleExclusions;

}
