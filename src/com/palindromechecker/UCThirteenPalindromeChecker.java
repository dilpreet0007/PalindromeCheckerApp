package com.palindromechecker;

import java.util.*;

/*
* UC13 Time is calculated in this
* @version 13.0
* @author Dilpreet
*/

public class UCThirteenPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		long startTime1 = System.nanoTime();
		checkPalUsingTwoPointer(s);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		checkPalUsingStack(s);
		long endTime2 = System.nanoTime();
		
		System.out.println("checkPalUsingTwoPointer: " + (endTime1-startTime1) + "ns");
		System.out.println("checkPalUsingStack " + (endTime2-startTime2) +"ns");
		
	}
	
	public static void checkPalUsingTwoPointer(String s) {
		int start=0,end=s.length()-1;
		boolean isPal = true;
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				isPal = false;
				break;
			}
			start++;
			end--;
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
	}
	
	public static void checkPalUsingStack(String s) {
		Stack<Character> st = new Stack<>();
		boolean isPal = true;
		for(char c : s.toCharArray()) {
			st.push(c);
		}
		
		for(char c : s.toCharArray()) {
			if(c!=st.pop()) {
				isPal = false;
				break;
			}
		}
		
		if(isPal) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");
	}

}
