package com.liu.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 月神拿到一个新的数据集，其中每个样本都是一个字符串（长度小于100），样本的的后六位是纯数字，月神需要将所有样本的后六位数字提出来，转换成数字，
 * 并排序输出。
 * 输入  4 abc123455 boyxx213456 cba312456 cdwxa654321 
 * 输出  123455 213456 312456 654321
 * 
 * 
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(bf.readLine());
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			// s.substring(s.length-6);
			ans[i] = Integer.parseInt(s.substring(s.length() - 6));
		}
		System.out.println(Arrays.toString(ans));
		Arrays.sort(ans);
		System.out.println(Arrays.toString(ans));
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		bf.close();
	}
}
