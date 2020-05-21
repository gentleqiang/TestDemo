package com.debug.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午10:57:38
*/
public class TestGrounp {
    public static <V> void main(String[] args) {
		
    	Employee e1 = new Employee("java", 1,"1000");
    	Employee e2 = new Employee("php", 2,"2000");
    	Employee e3 = new Employee("python", 3,"4000");
    	Employee e4 = new Employee("python", 3,"3000");
    	Employee e5 = new Employee("java", 4,"1000");
    	ArrayList<Employee> list = new ArrayList<Employee>();
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	list.add(e4);
    	list.add(e5);
    	//System.out.println(list);
    	//method01(list);
    	method02(list);
	}

	private static void method02(ArrayList<Employee> list) {
		// TODO 求集合中属性值的分组
		Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getSalary));
	    System.out.println(collect);
	    
		/*
		 * {4000=[Employee [name=python, age=3, salary=4000]], 1000=[Employee
		 * [name=java, age=1, salary=1000], Employee [name=java, age=4, salary=1000]],
		 * 2000=[Employee [name=php, age=2, salary=2000]], 3000=[Employee [name=python,
		 * age=3, salary=3000]]}
		 */
	    
	    Set<String> keySet = collect.keySet();
	    System.out.println(keySet);
	    
		/* [4000, 1000, 2000, 3000] */
	    
	    Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
	    for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	    
		/*
		 * 4000 [Employee [name=python, age=3, salary=4000]] 1000 [Employee [name=java,
		 * age=1, salary=1000], Employee [name=java, age=4, salary=1000]] 2000 [Employee
		 * [name=php, age=2, salary=2000]] 3000 [Employee [name=python, age=3,
		 * salary=3000]]
		 */
		
		
	}

	private static void method01(ArrayList<Employee> list) {
		//TODO 求集合中属性值的分组
		//根据name属性分组
		Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getName));
		//System.out.println(collect);
		
		//根据name属性分组，每组几条数据
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		//System.out.println(collect2);
		
		
		/*
		 * 控制台输出
		 * {python=[Employee [name=python, age=3, salary=4000], Employee [name=python,
		 * age=3, salary=3000]], java=[Employee [name=java, age=1, salary=1000],
		 * Employee [name=java, age=4, salary=1000]], php=[Employee [name=php, age=2,
		 * salary=2000]]} 
		 * {python=2, java=2, php=1}
		 */
		
		//将name属性作为key获得当前一个组的数据
		List<Employee> list2 = collect.get("java");
		System.out.println(list2);
		/*
		 * [Employee [name=java, age=1, salary=1000], Employee [name=java, age=4,
		 * salary=1000]]
		 */	
        }
}



































