
package com.palindromechecker;

import java.util.Scanner;
/*
 * UC11 Used OOPS concept to check string is Palindrome or not
 * @version 11.0
 * @developer Dilpreet
 */
public class UCElevenPalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		if(PalService.checkPal(s)) System.out.println("String is Palindrome");
		else System.out.println("String is not Palindrome");
	}
}

class PalService{
	public static boolean checkPal(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}
