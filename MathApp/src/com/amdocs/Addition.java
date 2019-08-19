package com.amdocs;

import java.util.Scanner;

public class Addition {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		int firstInput = scanner.nextInt();
		int secondInput = scanner.nextInt();
		
		Addition addition = new Addition();
		int result = addition.add(firstInput, secondInput);
	
		System.out.println("Result is " + result);
	}

}
