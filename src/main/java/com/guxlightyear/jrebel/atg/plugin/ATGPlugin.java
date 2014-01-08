package com.guxlightyear.jrebel.atg.plugin;

import org.zeroturnaround.javarebel.ClassResourceSource;
import org.zeroturnaround.javarebel.Plugin;

/**
 * Entry point of the plugin. Provides some runtime information, such as author, id and all that good stuff.
 * Also it registers the right CBP classes.
 * 
 * @author Gustavo Recio
 */
public class ATGPlugin implements Plugin {

	/**
	 * Setup the integration. 
	 */
	@Override
	public void preinit() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean checkDependencies(ClassLoader arg0, ClassResourceSource classResourceSource) {
		// should be active only when ATG is in the classpath
		return classResourceSource.getClassResource("atg.nucleus.Nucleus") != null;
	}

	@Override
	public String getAuthor() {
		return "Gustavo Recio";
	}

	@Override
	public String getDescription() {
		return "Reload ATG repositories and global components";
	}

	@Override
	public String getId() {
		return getName();
	}

	@Override
	public String getName() {
		return "atg-jrebel-plugin";
	}

	@Override
	public String getSupportedVersions() {
		return null;
	}

	@Override
	public String getTestedVersions() {
		return null;
	}

	@Override
	public String getWebsite() {
		return "https://github.com/guxlightyear/atg-jrebel-plugin";
	}

}
