package com.collabera;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamBasics {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
		
		int sum = 0;
		
		// first way
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i));
		// to find the sum
			sum+=values.get(i);
			}
		// second way
		for(int i: values)
			System.out.println(i);
		
		// third way
		Iterator<Integer> i = values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		// fourth way
		// 1.8
		
		// Mutation
		
		values.forEach(vali -> System.out.println(vali));
		
		Integer sum2 = values.stream()
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("stream case: " + sum2);
		
		// this is done on the JVM level
		// more efficient process
		// uses the JVM scope
		// Mutation : internal expression means it is evaluated on the JVM scope, external expressions are if statements and loops
		values.stream().filter(element -> element%2 == 1).forEach(val -> System.out.println("This stream has an odd value of: " + val));
		
		// internal expressions
		values.stream().reduce(0,(num1,num2) -> num1+num2);
	}

}
