package com.debug.lambda;

public class Employee {
     
	private String name;
	private Integer age;
	private String salary;
	public Employee(String name, Integer age, String salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
