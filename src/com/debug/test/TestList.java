package com.debug.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
    public static void main(String[] args) {
		//method01();
    	method02();
	}

	private static void method02() {
		// TODO Auto-generated method stub
		
	}

	private static void method01() {
		//List的子类ArrayList集合
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("JDK");
		arrayList.add("Spring Framework");
		arrayList.add("MyBatis framework");
		arrayList.add("Java中文社群");
		/*
		 * Iterator<String> iterator = arrayList.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		
		/*
		 * for (int i = 0,length = arrayList.size(); i < length ;i++) {
		 * System.out.println(arrayList.get(i)); }
		 */
		
		/*
		 * for (String liSt : arrayList) { System.out.println(liSt); }
		 */
		
		/* arrayList.forEach(string -> System.out.println(string)); */
		
		/* arrayList.stream().forEach(string -> System.out.println(string)); */
	}
}
