package com.full.notes.model;
import java.util.ArrayList;
import java.util.List;

public class Note {
	private String title;
	private boolean isPinned;
	private boolean isDeleted;
	private Color color;
	private long lastEdited;
	private boolean isArchived;
	
	private List<Collaborator> collaborators;
	private List<String> labels;
	private List<ListItem> listItems;
	
	private NoteReminder noteReminder;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPinned() {
		return isPinned;
	}

	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public long getLastEdited() {
		return lastEdited;
	}

	public void setLastEdited(long lastEdited) {
		this.lastEdited = lastEdited;
	}

	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public List<Collaborator> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(List<Collaborator> collaborators) {
		this.collaborators = collaborators;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public NoteReminder getNoteReminder() {
		return noteReminder;
	}

	public void setNoteReminder(NoteReminder noteReminder) {
		this.noteReminder = noteReminder;
	}

	
	public List<ListItem> getListItems() {
		return listItems;
	}

	public void setListItems(List<ListItem> listItems) {
		this.listItems = listItems;
	}

//	@Override
//	public String toString() {
//		return listItems.toString();
//	}
	
	public void debugDisplay() {
		System.out.println("List in the object contains = "  + listItems.toString());
		
		
		for(int i = 0; i < listItems.size(); i++) {
			System.out.println(listItems.get(i).getText());
		}
	}
	
	public void makeCopy() {
		List<ListItem> copyOfListItems = new ArrayList<ListItem>();
		for(int i = 0; i < listItems.size(); i++) {
			copyOfListItems.add(listItems.get(i));
		}
		List<ListItem> notACopyOfListItems = listItems;
		
		listItems.add(new ListItem("I am confused by Java's way of passing objects by reference. "));
		
		notACopyOfListItems.add(new ListItem("What the heck is happening ????? "));
		
		copyOfListItems.add(new ListItem("JamesWASHERE"));
		System.out.println(copyOfListItems);
	}
}
