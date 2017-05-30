package com.full.notes.view;

import java.util.Scanner;

import com.full.notes.model.ListItem;

public class NotesViewHelper {

	public String askUserForTitle() {
		System.out.println("Enter Note titla:  ");
		
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		
		return title;

	}

	public ListItem askUserForNote() {
		// TODO Auto-generated method stub
		System.out.println("Enter list item: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		ListItem item = new ListItem(text);
		
		return item;
	}

	public int askUserForMoreNotes() {
		int choice = 0;
		System.out.println("Enter another note?  ");

		System.out.println("1. Yes");
		System.out.println("0. No");

		System.out.println("Choice: ");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		return choice;
	}
}
