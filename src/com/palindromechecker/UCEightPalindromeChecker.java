package com.palindromechecker;
import java.util.*;
/*
* UC8 string is reversed and checked using LinkedList if string is palindrome or not
* @version 8.0
* @author Dilpreet
*/

public class UCEightPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s =  sc.nextLine();
		boolean isPal = true;
		System.out.println("Input String: " + s);
		LinkedList<Character> ll = new LinkedList<>();
		
		for(char c : s.toCharArray()) {
			ll.add(c);
		}
		
		while(ll.size()>1) {
			if(ll.removeFirst()!=ll.removeLast()) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");

	}

}
