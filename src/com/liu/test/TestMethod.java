package com.liu.test;

import org.junit.Test;


public class TestMethod {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Test
	public void test() {
//		testMath();
		TestMethod curry = new TestMethod();
        curry.setName("small student");
        System.out.println(curry.getName());
        printAll(curry);
        System.out.println(curry.getName());
        System.out.println(curry);

		
	}
	
	
	
	
	/**
	 * 6.三个与取整有关的方法： Math.ceil():表示向上取整；Math.ceil(11.3)=12.0;Math.ceil(-11.3)=-11.0。
	 * 
	 * Math.floor():表示向下取整；Math.floor(11.6)=11.0;Math.floor(-11.6)=-12.0。
	 * 
	 * Math.round():表示四舍五入；Math.round(11.5)=12;Math.round(-11.5)=-11;
	 * 
	 * Marh.round(11.3)=11;Math.round(-11.3)=--11;
	 * 
	 *
	 */
	public void testMath() {
		System.out.println(Math.ceil(11.3));
		System.out.println(Math.ceil(-11.3));
		System.out.println(Math.floor(11.6));
		System.out.println(Math.floor(-11.6));
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
		System.out.println(Math.round(11.3));
		System.out.println(Math.round(-11.3));
		System.out.println(Math.round(-11.6));
		double a = 99.6;
		int b = (int) a;
		System.out.println(b);
	}

	//使用java.lang.Math,生成100个0到99之间的随机整数，找出最大和最小，并统计大于50的整数个数？
	public void TestRandom() {
		int min = 99;
		int max = 0;
		int temp;
		int count = 0;
		for (int i = 0; i < 100; i++) {
			temp = (int) (Math.random() * 100);
			// System.out.println(temp);
			if (temp > 50) {
				count++;
			}

			if (min > temp) {
				min = temp;
			}

			if (max < temp) {
				max = temp;
			}
		}
		System.out.println("Max is:" + max);
		System.out.println("Min is:" + min);
		System.out.println("The count that bigger than 50 is:" + count);
	}
	
	public static void printAll(final TestMethod temp) {
		temp.setName("fk do it");
//		System.out.println(temp.getName());
		// temp = new Curry(); 传送进来的Curry引用是final，不可以再赋值了，这里一定会报错哦！
	}
	

}
