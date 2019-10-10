package com.jd.test;
import java.util.concurrent.ThreadPoolExecutor;

class A{
	static {
		System.out.print("A");
	}
}
public class Test {

    public static void main(String[] args) throws Exception{
      ClassLoader classLoader=ClassLoader.getSystemClassLoader();
      Class clazz=classLoader.loadClass("A");
      System.out.print("Test");
      clazz.forName("A");
      //ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)
    }
}
