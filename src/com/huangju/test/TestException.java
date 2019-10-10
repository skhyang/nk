package com.huangju.test;

public class TestException {
	public static Integer divide(int i) throws Exception {
		Integer result = null;
		result = 9 / i;
//		try {
//			result = 9 / i;
//			System.out.print("A");
//		} catch (Exception ex) {
//			System.out.print("B");
//			throw new Exception("C");
//		} finally {
//			System.out.print("D");
//		}
		return result;
	}

	public static void main(String[] args) {
		try {
			System.out.print(divide(0));
			System.out.print("E");
		} catch (Exception ex) {
			System.out.print("F");
		}
		System.out.print("G");
	}

}
