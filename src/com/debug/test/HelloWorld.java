package com.debug.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class HelloWorld {

   public static void main(String args[]) {
	   //HashMap的七种遍历方式
	   HashMap<Integer, String> map = new HashMap<Integer, String>();
	   map.put(1, "Java");
	   map.put(2, "JDK");
	   map.put(3, "Spring Framework");
	   map.put(4, "MyBatis ramework");
	   map.put(5, "Java中文社群");
	   //method01(map);
	   //method02(map);
	   //method03(map);
	   //method04(map);
	   //method05(map);
	   //method06(map);
	   //method07(map);
   }

private static void method07(HashMap<Integer, String> map) {
	 //使用Streams API多线程的方式进行遍历
	 map.entrySet().parallelStream().forEach(entry -> {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	});
	
}

private static void method06(HashMap<Integer, String> map) {
	 //使用Streams API单线程的方式进行遍历
	 map.entrySet().stream().forEach(entry -> {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	});
	
}

private static void method05(HashMap<Integer, String> map) {
	 //使用Lamba表达式的方式进行遍历
	 map.forEach((key, value) -> {
		// TODO Auto-generated method stub
		System.out.println(key);
		System.out.println(value);
	});	
}

private static void method04(HashMap<Integer, String> map) {
	 //使用For Each keySet的方式进行遍历
	Set<Integer> keySet = map.keySet();
	for (Integer key : keySet) {
		System.out.println(key);
		System.out.println(map.get(key));
	}
	
	
}

private static void method03(HashMap<Integer, String> map) {
	  //使用For Each EntrySet的方式进行遍历
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
}

private static void method02(HashMap<Integer, String> map) {
	  //  使用迭代器keySet的方式进行遍历
	  Iterator<Integer> iterator = map.keySet().iterator();
	  while (iterator.hasNext()) {
		 Integer key = iterator.next();
		 System.out.println(key);
		 System.out.println(map.get(key));
	 }
	
}

private static void method01(HashMap<Integer, String> map) {
	  //使用迭代器EntrySet的方式进行遍历
	   Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
	   while (iterator.hasNext()) {
		   Entry<Integer, String> entity = iterator.next();
		   System.out.println(entity.getKey());
		   System.out.println(entity.getValue());
	   }
   }
}
