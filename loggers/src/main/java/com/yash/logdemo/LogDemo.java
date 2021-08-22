package com.yash.logdemo;

import org.apache.log4j.Logger;

import jdk.internal.org.jline.utils.Log;

public class LogDemo {
	static Logger logger = Logger.getLogger(LogDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loggers Executed");
		logger.info("This is the log message");
		logger.warn("Warning message");
		logger.error("Error");
		logger.debug("Debug");
		logger.fatal("Fatal Error!");
		Log.info("LL");
	}

}
