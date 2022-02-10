package ru.job4j;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4jSLF {

	private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

	public static void main(String[] args) {
		String log4jConfPath = "src/main/resources/log4j.properties.properties";
		PropertyConfigurator.configure(log4jConfPath);
		String name = "Test";
		int age = 10;
		LOG.trace("trace message");
		LOG.debug("debug message");
		LOG.info("info message");
		LOG.warn("warn message");
		LOG.error("error message");
		LOG.debug("Name is: {},Age is: {}", name, age);
	}
}
