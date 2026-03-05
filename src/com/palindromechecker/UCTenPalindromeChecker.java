package com.palindromechecker;

import java.util.*;

/*
 * UC10 Checking Palindrome ignoring spaces symbols and uppercase
 * @version 10.0
 * @author Dilpreet
 */

public class UCTenPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		StringBuilder res = new StringBuilder();
		
		for(char c : sb.toString().toCharArray()) {
			if(c>= 'a' && c<='z') {
				res.append(c);
			}
		}
		
		if(res.toString().equals(res.reverse().toString())) {
			System.out.println("String is Palindrome" );
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}

}
