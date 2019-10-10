package com.liu.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;
import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

public class TestString2 {
	public  static void main(String[] args) throws IOException{
        int num = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = Integer.parseInt(s);
        if(n>1){
            num = n*(n-1)/2 + n/1 + 1;
            System.out.println(num);
        }else{
            num = 1;
            System.out.println(num);
        }
        bf.close();
    }
	
	@Test
	public void test(){
		byte a = 127;
		byte b = 127;
//		byte a = 3;
//		byte b = 4;
		a+=b;
		System.out.println(a);
	}
	@Test
	public void test2(){
		String x = "1";
		int y = 1;
		int z = 2;
		System.out.println(x+y+z);
	}
	@Test
	public void test3() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
				map.put(ch, 1);
			}else {
				int num = (int) map.get(ch);
				map.put(ch, num+1);
			}
        }
        //遍历
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			Entry<Character, Integer> entry = (Entry<Character, Integer>) object;
			System.out.print(entry.getKey()+""+entry.getValue());
		}
        bf.close();
		/* Scanner in = new Scanner(System.in);
	        String s = in.next();
	        Map map=new HashMap();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(map.get(ch)==null){
	                map.put(ch,1);
	            }else{
	                int cnt= (int) map.get(ch);
	                map.put(ch,cnt+1);
	            }
	        }
	        for(Object obj : map.entrySet()){
	            Map.Entry<String,Integer> entry= (Map.Entry<String, Integer>) obj;
//	            Map.Entry<?,Integer> entry= (Map.Entry<?, Integer>) obj;
	            System.out.print(String.valueOf(entry.getKey())+ entry.getValue());//不加String.valueOf的话会出现运行时异常java.lang.ClassCastException: java.lang.Character cannot be cast to java.lang.String
	        }
	        in.close();*/
	}
	@Test
	public void test4(){
		double j = 10.0;
		Double j2 = 10.0;
		float i = 10.0f;
		Float i2 = 10.0F;
		int jj = 1;
		long ii = 1;
		Long iii = 1l;
		String s = "hhh";
		System.out.println(s.length());
		System.out.println(i+s);
		int a[] = new int[0];
		int b[][] = new int[3][];
		int c[] =new int[]{1,2,3};
		int d[] ={1,2,3};
		int e[][] =new int[][]{};
//		int f[][2] = {{1,2},{1,2},{1,2}};
//		int g[3][3] = {{1},{2},{3}};
		List bList = new ArrayList();
		bList.size();
		StringBuffer sb = new StringBuffer("aabab");
		int index = sb.indexOf("a", 1);
		System.out.println(index);
	}
	
}
