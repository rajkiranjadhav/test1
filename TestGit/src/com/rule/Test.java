package com.rule;



import org.apache.log4j.xml.DOMConfigurator;

import com.util.VtransactLogger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 DOMConfigurator.configure("conf/log4j.xml");
         VtransactLogger.writeLog("Initalizing App launcher...", 0);
		
		System.out.println("Hi4");
		
	}

}
