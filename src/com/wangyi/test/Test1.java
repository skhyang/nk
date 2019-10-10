package com.wangyi.test;

import java.util.Scanner;

import org.junit.Test;

public class Test1 {
	@Test
	public void tanXin() {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArray = s.split(" ");
        int[] a = new int[sArray.length];
        for(int i=0;i<sArray.length;i++){
            a[i]= Integer.parseInt(sArray[i]);
        }
        int x = a[0];
        int f = a[1];
        int d = a[2];
        int p = a[3];
        int day;
        if((d-x*f)>0){
            day = (d-x*f)/(p+x) + f;
        }else{
            day = d/x;
        }
        System.out.println(day);
       // return day;
	}
}
