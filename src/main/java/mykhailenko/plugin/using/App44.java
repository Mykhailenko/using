package mykhailenko.plugin.using;

import org.apache.log4j.Logger;

/**
 * Hello world!
 * 
 */
public class App44 {
	private static final Logger LOGGER = Logger.getLogger(App44.class);

	public static void main(String[] args) {
		LOGGER.trace("trace");
		LOGGER.debug("debug");
		LOGGER.info("info");
		LOGGER.warn("warn");
		LOGGER.error("error");
		LOGGER.fatal("fatal");
		System.out.println("Hello World!");
	}
}
