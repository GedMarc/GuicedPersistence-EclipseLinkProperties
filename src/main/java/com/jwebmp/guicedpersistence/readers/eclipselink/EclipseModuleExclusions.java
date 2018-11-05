package com.jwebmp.guicedpersistence.readers.eclipselink;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class EclipseModuleExclusions
		implements IGuiceScanJarExclusions<EclipseModuleExclusions>,
				           IGuiceScanModuleExclusions<EclipseModuleExclusions>
{
	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("org.eclipse.persistence.antlr*");
		strings.add("org.eclipse.persistence.asm*");
		strings.add("org.eclipse.persistence.core*");
		strings.add("org.eclipse.persistence.jpa*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();

		strings.add("eclipselink.antlr");
		strings.add("eclipselink.asm");
		strings.add("eclipselink.core");
		strings.add("eclipselink.jpa");

		return strings;
	}
}
