package com.palindromechecker;
import java.util.*;
/*
* UC7 string is reversed and checked using dequeue if string is palindrome or not
* @version 7.0
* @author Dilpreet
*/
public class UCSevenPalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s =  sc.nextLine();
		boolean isPal = true;
		System.out.println("Input String: " + s);
		Deque<Character> dq = new ArrayDeque<>();
		
		for(char c : s.toCharArray()) {
			dq.add(c);
		}
		
		while(dq.size()>1) {
			if(dq.removeFirst()!=dq.removeLast()) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
	}
}
