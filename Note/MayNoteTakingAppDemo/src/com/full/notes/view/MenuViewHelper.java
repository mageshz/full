package com.full.notes.view;

import java.util.Scanner;

public class MenuViewHelper {

	public void showWelcomeMessage() {
		System.out.println("Welcome to the FULL Notes Console app.");
	}

	public int showMainMenuAndRetrieveChoice() {
		int choice = 0;
		do {
			System.out.println("Choose an option below:  ");

			System.out.println("1. Create Note");
			System.out.println("0. Quit application");

			System.out.println("Choice: ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

		} while (choice > 1 || choice < 0);

		return choice;

	}
}
