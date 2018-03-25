package com.test;

import java.io.IOException;
import java.util.Date;

import com.util.MyLogger;

public class TestA {

	
	TestA() throws IOException
	{
		MyLogger.writeLog("===constructor TestA===");

	}
	
	static{
		
		
		try {
			MyLogger.writeLog("===Static block===");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	public static void main(String []args) throws Exception
	{
		
		
		MyLogger.writeLog("===main method===");
		
		B.main(args);
		
	}
	
	
	
	static
	{
		try {
			MyLogger.writeLog("===Static block 2===");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public Object testMethod1() throws Exception
	{
		MyLogger.writeLog("testMethod1 -- A ");
		return null;
	}
	
}


class B extends TestA{
	
	
	B() throws IOException
	{
		MyLogger.writeLog("===Constructor B===");

	}
	
	public static void main(String []args) throws Exception
	{
		MyLogger.initializeLogger();
		
		MyLogger.writeLog("===main method 2===");
		
	TestA testA=new B();
	testA.testMethod1();
	
	MyLogger.writeLog("===main method 3===");
	
	new B();
	MyLogger.writeLog("===main method 4===");
	
	
	D obj= D.getInstanceD();
	
	D obj2= D.getInstanceD();
	
	System.out.println(""+obj+" :: "+obj2);

	
	}
	
	
	public String testMethod1() throws Exception
	{
		MyLogger.writeLog("testMethod1 -- B ");
		return null;
	}
	
}


class C extends TestA{
	
	
	C() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String testMethod1() throws Exception
	{
		MyLogger.writeLog("testMethod1 -- C ");
		return null;
	}
	
	
}


class D
{
	
private D()
{

}

private static D obj=null;

public static D getInstanceD() throws Exception
{
	
	float f1 =12.4f;
	
	double f2 =12.4;
	
	
	synchronized (D.class) {
		
		if(obj == null)
		{
			MyLogger.writeLog("START "+new Date() );
			
			obj = new D();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			MyLogger.writeLog("END "+new Date() );
		}
		
	}
	
	
return obj; 
}


}



class testX
{
	

	public static void main(String [] args) 
    {
        int I = 1;
        do while ( I <= 1 )
        { System.out.print("I is " + I);
        break;
        }
        while ( I > 1 ) ;
    }
}





