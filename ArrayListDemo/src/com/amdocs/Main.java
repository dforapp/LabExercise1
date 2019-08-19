package com.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers =  new ArrayList<Integer>();
		
		numbers.add(100);
		numbers.add(50);
		numbers.add(10);
		numbers.add(500);
		numbers.add(150);
		
		System.out.println("Size of array list is " + numbers.size());
		
		System.out.println("List of elements are ........");
		for(int element : numbers) {
			System.out.println(element);
		}
		
		Collections.sort(numbers);
		System.out.println("Sorted elements are ....." + numbers);
		
		
	}
}
