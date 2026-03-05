package com.palindromechecker;
import java.util.*;
/*
* UC3 string is stacked and checked with queue if string is palindrome or not
* @version 6.0
* @author Dilpreet
*/
public class UCSixPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =  sc.nextLine();
		boolean isPal = true;
		System.out.println("Input String: " + s);
		Stack<Character> stack = new Stack<>();
		Queue<Character> q = new LinkedList<>();
		
		for(char c : s.toCharArray()) {
			stack.push(c);
			q.add(c);
		}
		
		while(!q.isEmpty()) {
			if(q.remove()!=stack.pop()) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
		

	}

}
