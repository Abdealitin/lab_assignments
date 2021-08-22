package com.yash.logdemo;

import org.apache.log4j.Logger;

import jdk.internal.org.jline.utils.Log;

public class LoggingException {
	
	static Logger logger = Logger.getLogger(LoggingException.class.getName());
	
	public static void add(int a, int b) {
		logger.info("Perform Addition and the sum is:");
		int sum = a+b;
		logger.info(sum);
	}
	
	public static void div(int a, int b) {
		logger.info("Performing Division:");
		
		try {
			logger.warn("We are in division method:It may throws an exception!");
			double div = a/b;
			logger.info(div);
		}catch(ArithmeticException e) {
			logger.error("Logging Exception : "+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		add(a,b);
		div(a,b);
	}

}
