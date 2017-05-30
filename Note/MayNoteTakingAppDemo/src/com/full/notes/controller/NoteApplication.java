package com.full.notes.controller;
import java.util.ArrayList;
import java.util.List;

import com.full.notes.model.ListItem;
import com.full.notes.model.Note;
import com.full.notes.model.User;
import com.full.notes.view.MenuViewHelper;
import com.full.notes.view.NotesViewHelper;

// controller
public class NoteApplication {

	List<User> users;
	
	// controller - starts here
	public static void main(String args[]) {
		
		// welcome the user
		MenuViewHelper menuViewHelper = new MenuViewHelper();
		menuViewHelper.showWelcomeMessage();
		
		// show main menu to the user and get the choice
		int choice = menuViewHelper.showMainMenuAndRetrieveChoice();
		
		if(choice == 1) {
			// go to the Create Note flow
			createNote();
			
		} else if(choice == 0) {
			System.out.println("Thank you. Exiting application.");
			System.exit(0);
		}
		
	}
	
	
	public static void createNote() {
		
		NotesViewHelper notesViewHelper = new NotesViewHelper();
		String title = notesViewHelper.askUserForTitle();
		Note note = new Note();
		note.setTitle(title);
		
		// while user wants to keep entering notes
		List<ListItem> listItem = new ArrayList<ListItem>();
		int choice = 1;
		while(choice != 0) {
			ListItem item = notesViewHelper.askUserForNote();
			choice = notesViewHelper.askUserForMoreNotes();
			
			List<ListItem> l = note.getListItems();
		}
	}
	
}
