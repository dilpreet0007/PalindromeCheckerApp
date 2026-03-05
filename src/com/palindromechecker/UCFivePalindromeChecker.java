package com.palindromechecker;

import java.util.*;
/*
* UC5 string is stacked and checked if string is palindrome or not
* @version 5.0
* @author Dilpreet
*/

public class UCFivePalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s =  sc.nextLine();
		boolean isPal = true;
		System.out.println("Input String: " + s);
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			stack.push(c);
		}
		
		for(char c : s.toCharArray()) {
			if(c!=stack.pop()) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
	}

}
