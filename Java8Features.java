package com.pratcie.akshay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Features {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"Akshay");
		Employee emp2 = new Employee(2,"Akshay");
		
		Employee emp3 = new Employee(3,"Arti");
		Employee emp4 = new Employee(4,"Arti");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getName));
		
		System.out.println(map);
		
		Map<String, Long> map1 = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		
		System.out.println(map1);
		
		Map<String, List<Employee>> map3 = list.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.toList()));
		
		System.out.println(map3.get("Akshay"));
		
	}

}
