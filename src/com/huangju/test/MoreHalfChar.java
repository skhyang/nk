package com.huangju.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 对于任意给定的一组字符组成的一个数组，假设一定存在某个字符出现的总次数超过其它字符出现的总次数之和，
 * 如：字符数组['a','b','2','b','b']中的字符'b'，再如字符数组['c','2','c','c']中的字符'c'。
 * @author Administrator
 *
 */

public class MoreHalfChar {
	public static void main(String[] args) {
		char[] choices = new char[] { 'a', 'b', '2', 'b', 'b' };
		MoreHalfChar teseter = new MoreHalfChar();
		System.out.println("first method result:" + teseter.first_findMoreHalfChar(choices));
		// System.out.println("second method result:" +
		// teseter.second_findMoreHalfChar(choices));
		// System.out.println("third method result:" +
		// teseter.thirdMethod_findMoreHalfChar(choices));
	}

	/**
	 * 直接遍历，hashmap存储
	 * 
	 * @param choices
	 * @return
	 */
	char first_findMoreHalfChar(char[] choices) {
		if (choices == null)
			throw new RuntimeException("char[] is null");
		Map<Character, Integer> timesMap = new HashMap<Character, Integer>();
		for (int i = 0; i < choices.length; i++) {
			timesMap.put(choices[i], timesMap.get(choices[i]) == null ? 1 : timesMap.get(choices[i]) + 1);
		}
		Iterator<Entry<Character, Integer>> itr = timesMap.entrySet().iterator();
		// Entry<Character, Integer> elm = null;
		while (itr.hasNext()) {
			//Entry<Character,Integer> entry = (Entry<Character,Integer>) itr.next();
			Entry<Character,Integer> entry = itr.next();
			if (entry.getValue()>choices.length/2) {
				return entry.getKey();
			}
			
		}
		return 'n';
	}
}
