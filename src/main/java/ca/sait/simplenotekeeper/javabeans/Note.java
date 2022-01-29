package ca.sait.simplenotekeeper.javabeans;

import java.io.Serializable;

/**
 * represents a Note
 * @author Leila Nalivkina, Nick Hemnett
 */
public class Note implements Serializable {

	private String title;
	private String contents;
	
	public Note () {
		title = "";
		contents = "";
	}

	public Note (String title, String contents) {
		this.title = title;
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
