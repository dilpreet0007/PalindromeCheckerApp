package com.palindromechecker;

import java.util.Scanner;

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
			System.out.println("String is Palindrome");
		}
		else System.out.println("String is Not Palindrome");
	}
}
