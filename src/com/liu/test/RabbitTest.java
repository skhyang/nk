package com.liu.test;
/**
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
 * 指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波那契数列以如下被以递推的方法定义：
 * F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * @author Administrator
 *
 */
public class RabbitTest {
	public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
	public static void main(String[] args) {
		RabbitTest rabbitTest = new RabbitTest();
		int a = rabbitTest.Fibonacci(9);
		System.out.println(a);
	}
}
