package com.palindromechecker;

import java.util.*;

/*
 * UC9 Checking if string is Palindrome or not using recursive approach
 */

public class UCNinePalindromeChecker {
	
	public static boolean checkPal(String s ,int start,int end) {
		if(start>=end) {
			return true;
		}
		
		if(s.charAt(start)!=s.charAt(end)) return false;
		
		return checkPal(s,start+1,end-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		boolean isPal = checkPal(s,0,s.length()-1);
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
	}

}
