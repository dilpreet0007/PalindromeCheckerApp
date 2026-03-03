package com.palindromechecker;

public class UCTwoPalindromeChecker {

	public static void main(String[] args) {
		String s =  "madam";
		boolean isPal = true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}

	}

}
