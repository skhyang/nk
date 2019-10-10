package com.huangju.test;

import org.junit.experimental.theories.Theories;

public class IsAnd {
	public static void main(String[] args) {
		int a[] = {5,20,4,4,3};
		//int a[] = {5,3,7,19};
		//IsAnd isAnd = new IsAnd();
		 System.out.println(new IsAnd().isAnd(a));
	}
	public boolean isAnd(int[] a) {
		if (a==null||a.length==0) {
			return false;
		}
		int s = a[0];
		int min = s;
		for (int i = 0; i < a.length; i++) {
			s &= a[i];//相同的数&还是原来的数
			if (min>a[i]) {
				min = a[i];
			}
		}
		if (min == s) {
			return true;
		}
		return false;
		
	}
}
