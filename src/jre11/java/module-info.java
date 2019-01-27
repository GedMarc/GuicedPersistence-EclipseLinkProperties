module com.jwebmp.guicedpersistence.readers.eclipselink {
	requires com.jwebmp.guicedpersistence;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	provides com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader with com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkDefaultConnectionBaseBuilderI;
	provides com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader with com.jwebmp.guicedpersistence.readers.eclipselink.EclipseLinkIPropertiesReader;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.guicedpersistence.readers.eclipselink.EclipseModuleExclusions;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.guicedpersistence.readers.eclipselink.EclipseModuleExclusions;

}
