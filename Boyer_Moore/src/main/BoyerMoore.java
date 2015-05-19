package main;

public class BoyerMoore {

	private String text;
	private String toSearch;
	public BoyerMoore(String text, String toSearch) {
		this.text = text;
		this.toSearch = toSearch;
	}
	
	public void decal (int i) {
		if (i < text.length() - toSearch.length()) {
			i += toSearch.length();
		}
	}
}
