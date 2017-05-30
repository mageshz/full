package com.full.notes.model;

import java.util.ArrayList;
import java.util.List;

public class ListItem {

	private String text;
	private boolean isDeleted = false;
	private boolean isCompleted = false;
	
	public ListItem() {}
	
	public ListItem(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	// test the ListItems
	public static void main(String args[]) {
		
		// bad version
		badTest();
		
	}
	
	private static void badTest() {
		Note note = new Note();
		ListItem item = new ListItem("Test 1");
		ListItem item2 = new ListItem("Test 2");
		
		List<ListItem> listItems = new ArrayList<ListItem>();
		listItems.add(item);
		listItems.add(item2);
		
		System.out.println("Original list = " + listItems);
		
		note.setListItems(listItems);
		
		List<ListItem> anotherList = note.getListItems();
		System.out.println("Original list = " + listItems);
		System.out.println("Another list = " + anotherList);
		
		listItems.remove(0);
		
		System.out.println("Original list = " + listItems);
		System.out.println("Another list = " + anotherList);
		
		//System.out.println(note);
		note.debugDisplay();
		note.makeCopy();
	}
}
