package main;

import java.util.HashMap;

public class BoyerMoore {

	private String text;
	private String toSearch;
	private HashMap<String, Integer> decalTable;
	public BoyerMoore(String text, String toSearch) {
		this.text = text;
		this.toSearch = toSearch;
		decalTable = new HashMap<>();
	}
	
	public void decal (int i) {
		if (i < text.length() - toSearch.length()) {
			i += toSearch.length();
		}
	}
}
