package com.yash.exceptions_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String technologies[] = {"Hadoop","Java","Python","Ruby","Javascript"};
		List<String> l = Arrays.asList(technologies);
		ArrayList<String> list = new ArrayList<>(l);
		list.add("J2EE");
		list.add("Python");
		ArrayList<String> nt = new ArrayList<>();
		nt.add("Big Data");
		nt.add("Kafka");
		nt.add("Hive");
		HashSet s = new HashSet();
		
		
		list.remove("Python");
		System.out.println(list);
//		System.out.println(list.addAll(nt));
//		System.out.println(list);
//		nt.clear();
//		System.out.println(nt);
//		System.out.println(list.get(5));
//		System.out.println(nt.isEmpty());
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) {
//			String s = it.next();
//			System.out.print(s+",");
//		}
//		
//		ListIterator<String> li = list.listIterator(2);
//		
//		while(li.hasNext()) {
//			String s = li.next();
//			System.out.println(s+",");
//		}
//		System.out.println(list.lastIndexOf("Kafka"));
//		
//		Object[] array = list.toArray();
//		System.out.println(Arrays.toString(array));
//		for(String s:list) {
//			System.out.print(s+",");
//		}
 	}

}
