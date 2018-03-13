package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyLogger {
	
	
	
	
	private MyLogger()
	{
		
	}
	
	
	
	public static void main(String []args) throws IOException
	{
		
		initializeLogger();
	}
	
	
	public static void initializeLogger() throws IOException
	{
		
		
		FileReader fileReader=new FileReader("conf/config.properties");
		
		Properties properties=new Properties();
		properties.load(fileReader);
		
		 DOMConfigurator.configure(properties.getProperty("log.FilePath"));
		 MyLogger.writeLog("=========initializeLogger========", 0);
		 
		 
		
		
		
	}
	
	
	
	public static void writeLog(String msg,long id) throws IOException
	{
		
		StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
		
		
		String className=stackTraceElements[2].getClassName();
		String methodName=stackTraceElements[2].getMethodName();
		int lineNumber=stackTraceElements[2].getLineNumber();
		
		Logger logger= Logger.getLogger(className);
		logger.info("|"+className+"|"+methodName+"|"+lineNumber+"|"+msg+"|FC-"+id);
		
		
	}
	

	public static void writeLog(String msg) throws IOException
	{
		long id=1;
		
		StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
		
		
		String className=stackTraceElements[2].getClassName();
		String methodName=stackTraceElements[2].getMethodName();
		int lineNumber=stackTraceElements[2].getLineNumber();
		
		Logger logger= Logger.getLogger(className);
		logger.info("|"+className+"|"+methodName+"|"+lineNumber+"|"+msg+"|FC-"+id);
		
		
	}

	
	
	public static void writeLogDebug(String msg,long id)
	{
		
	}
	
	
	public static void writeLogError(String msg,long id)
	{
		
	}
	
}
