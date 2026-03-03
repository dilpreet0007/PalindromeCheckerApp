package com.palindromechecker;
/*
* UC3 string is reversed and checked if string is palindrome or not
* @version 3.0
* @author Dilpreet
*/
public class UCThreePalindromeChecker {
	public static void main(String[] args) {
		String s = "level";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}
}
