package com.blz.Regex;

import java.util.regex.Pattern;

public class Regex1 {

	public static boolean validLastName(String name) {

		Pattern Lname = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

		boolean isValid = Lname.matcher(name).matches();

		return isValid;

	}

	public static void main(String[] args) {

		boolean valid = validLastName("1");

		if (valid == true) {

			System.out.println("it is valid");
		} else {

			System.out.println("it is invalid");
		}

	}

}
