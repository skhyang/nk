package com.huangju.test;

import java.util.ArrayList;
import java.util.List;

public class ExamSample {
	public static void main(String[] args) {
		new ExamSample().pluses();
	}

	public void pluses() {
		int i = -010;
		int j = ++i + i++ + i++ + ++i;
//		int j =  ++i ;
//			j += i++ ;
//			j += i++ ;
//			j += ++i;
		int k = j++ + ++j + j++ + ++j;
		System.out.println(String.format("i=%s,j=%s,k=%s", i, j, k));
		List list = new ArrayList();
		list.size();
	}
}
