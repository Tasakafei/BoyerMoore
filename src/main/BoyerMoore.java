package main;

import java.util.HashMap;

public final class BoyerMoore {

	private BadMatchTable matchTable = new BadMatchTable();

	private static int firstOccurence(String text, String toSearch, int position) {
		int lengthId = toSearch.length();
		int nbOcc = 0;
		position += lengthId -1;
		int cursor = position;
		while (position < text.length()) {
			// TODO TESTER LE FOR
			if (text.charAt(cursor) == toSearch.charAt(cursor)) {
				if (cursor == position - lengthId) {
					// on est arrivé au bout du mot
					nbOcc++;
					position += matchTable.get(text.charAt(position));
					cursor = position;
				} else {
					cursor--;
				}
			} else {
				position += matchTable.get(text.charAt(position));
				cursor = position;
			}
		}
	}
	public static int rechercheOccurences(String text, String toSearch) {
		int nbOccurences = 0;
		return nbOccurences;
	}
}
