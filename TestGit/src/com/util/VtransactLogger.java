package com.util;

import org.apache.log4j.Logger;


public class VtransactLogger
{

   private VtransactLogger()
   {
   }


   public static void writeLog(String messsage, long id)
   {
      StackTraceElement[] loggDetails = Thread.currentThread().getStackTrace();
      String fullClassName = loggDetails[2].getClassName();
      String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
      String methodName = loggDetails[2].getMethodName();
      int lineNumber = loggDetails[2].getLineNumber();

      Logger logger = Logger.getLogger(className);
      StringBuffer strMessage = new StringBuffer();
      strMessage.append(className).append(":");
      strMessage.append(methodName).append("::");
      strMessage.append(lineNumber);
      strMessage.append("|");
      strMessage.append(messsage).append("|");
      strMessage.append("flowContext-").append(id);
      
      logger.info(strMessage.toString());
      
      logger.debug(strMessage.toString());
      logger.error(strMessage.toString());
   }
}
