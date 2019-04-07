package com.bilgeadam.log4jexample;

import org.apache.log4j.Logger;

public class Log4JExample {

	static final Logger logger = Logger.getLogger(Log4JExample.class.getName());
	
	public static void main(String[] args) {
		Log4JExample exp = new Log4JExample();
		exp.test_logging("Bilgeadam");
	}

	private void test_logging(String string) {
		
		logger.trace("Trace logging : " + string);
		logger.debug("Debug logging : "  + string);
		logger.info("Info logging : " + string);
		logger.warn("Warn logging : " + string);
		logger.fatal("Fatal logging : " + string);
	
	}
}
