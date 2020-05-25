package com.debug.lambda;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
	protected static List<Employee> employeeList = Arrays.asList(
    			new Employee("张三", 18, "9999"),
    		    new Employee("赵四", 18, "222"),
    		    new Employee("王五", 60, "3339"),
    		    new Employee("二叔", 8, "9444"),
    		    new Employee("田七", 8,"9555")
    		    );
    public static void main(String[] args) {
	    //test01();
		test02();
    	//test03();
    	//test04();
    }

	private static void test04() {
		/*
		 * List<Integer> collect = employeeList.stream().map(t ->
		 * t.getAge()*2).collect(Collectors.toList()); collect.stream().forEach(t ->
		 * System.out.println(t));
		 */
				
	}

	private static void test03() {
		//java8 map的使用
		List<String> list = Arrays.asList("a","b","c","d");
		List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		collect.forEach(t -> System.out.println(t));
		
	}

	private static void test02() {
		//按照年龄的顺序输出
		//Collections.sort(employeeList, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
		//employeeList.sort((o1, o2) -> o1.getAge() - o2.getAge());
		employeeList.sort((o1, o2) -> {
			// TODO Auto-generated method stub
			if(o1.getAge() == o2.getAge()) {
				return o1.getName().compareTo(o2.getName()) ;
			}
			return o1.getAge() - o2.getAge();
		});
		employeeList.stream().forEach(t -> System.out.println(t));
	}

	private static void test01() {
		Collections.sort(employeeList,(e1, e2) -> {
			// TODO Auto-generated method stub
			if(e1.getAge() == e2.getAge()) {
				return e1.getName().compareTo(e2.getName());
			}
			/* return Integer.compare(e1.getAge(), e2.getAge()); */
			return e1.getAge().compareTo(e2.getAge());
		});		
		employeeList.stream().forEach(e -> System.out.println(e));				
	}
    
}
