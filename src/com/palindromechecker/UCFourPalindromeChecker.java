package com.palindromechecker;

import java.util.Scanner;

/*
 * UC4 Check string is palindrome or not using array
 * @version 4.0
 * @author Dilpreet
 */

public class UCFourPalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		String s = sc.nextLine();
		
		char[] arr = s.toCharArray();
		
		int start=0,end=arr.length-1;
		boolean isPal = true;
		
		while(start<end) {
			if(arr[start]!=arr[end]) {
				isPal = false;
			}
			start++;
			end--;
		}
		
		if(isPal) {
			System.out.println("String is Palindrome.");
		}
		else System.out.println("String is Not Palindrome.");
	}
}
