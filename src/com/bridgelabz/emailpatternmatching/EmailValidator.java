package com.bridgelabz.emailpatternmatching;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]{3,}([+_\\-\\.][a-zA-Z]{1,})?[@][a-zA-Z]{1,}[.][a-z]{2,}");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		System.out.println("Enter an email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();

		if(validateEmail(email))
			System.out.println("It is a valid email id");
		else 
			System.out.println("It is an invalid email id");

		sc.close();
	}
	
}
