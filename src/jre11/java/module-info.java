import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkDefaultConnectionBaseBuilderI;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkIPropertiesReader;
import com.jwebmp.guicedpersistence.readers.eclipselink.EclipseModuleExclusions;
import com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.eclipselink {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	provides IPropertiesConnectionInfoReader with EclipseLinkDefaultConnectionBaseBuilderI;
	provides IPropertiesEntityManagerReader with EclipseLinkIPropertiesReader;

	provides IGuiceScanModuleExclusions with EclipseModuleExclusions;
	provides IGuiceScanJarExclusions with EclipseModuleExclusions;

}
