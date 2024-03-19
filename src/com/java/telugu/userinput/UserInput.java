package com.java.telugu.userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.printf("Hey %s , How can i help you?",name);
		System.out.printf("Hey %s , How can i help you?",name);
		scanner.close();

	}

}
