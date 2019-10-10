package com.liu.test;

import java.io.IOException;

public class Test1 extends Test2{
	@Override
	//void f1() throws NullPointerException {//可以
	protected void f1() throws IOException, NullPointerException{
		//super.f1();
		System.out.println("子类重写父类的方法");
	}
}
class Test2{
	void f1() throws Exception{
		System.out.println("父类的方法");
	}
	//远程修改
}
