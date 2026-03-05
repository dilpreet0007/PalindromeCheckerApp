package com.palindromechecker;

import java.util.Scanner;
/*
* UC12 checking palindrome using interface and overriding it in runtime
* @version 12.0
* @author Dilpreet
*/

public class UCTwelvePalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		Service ps = new PalService();
		
		if(ps.check(s)) System.out.println("String is Palindrome");
		else System.out.println("String is Not Palindrome");

	}

}


