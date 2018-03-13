package com.rule;



import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;

import com.util.MyLogger;
import com.util.VtransactLogger;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//--- logger initialization---2 ---
		MyLogger.initializeLogger();
		
		MyLogger.writeLog("method invoked", 1);
		System.out.println("Hi4");
		MyLogger.writeLog("method end", 1);
		
	}

}
