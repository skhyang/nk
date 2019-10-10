package com.huangju.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteCounter implements Counter {

	private ConcurrentHashMap<String, AtomicInteger> map = new ConcurrentHashMap<>();
	
	@Override
	public int get(String str) {
		AtomicInteger atomicInteger = map.get(str);
		if (atomicInteger==null) {
			return 0;
		}
		return atomicInteger.get();
	}

	@Override
	public void add(String str) {
		AtomicInteger atomicInteger = map.get(str);
		if (atomicInteger==null) {
			map.put(str, new AtomicInteger(0));
		}
		map.put(str, new AtomicInteger(atomicInteger.get()+1));
	}

}
/*interface Counter {
    // 获取一个字符串的出现次数
    int get(String str);
    // 增加一个字符串的出现次数
    void add(String str);
}*/
