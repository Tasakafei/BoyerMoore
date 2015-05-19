package main;

import java.util.HashMap;

public final class BoyerMoore {

	private BadMatchTable matchTable = new BadMatchTable();

	private static int firstOccurence(String text, String toSearch, int position) {
		int lengthId = toSearch.length();
		position += lengthId -1;

		while (position < text.length()) {
			// TODO TESTER LE FOR
			for (int i = position; i-- > position - lengthId; ) {
				if (text.charAt(position) != (toSearch.charAt(lengthId - 1-i))) {
					position += matchTable.get(text.charAt(position));		
					break;
				}
			}
			
		}
	}
	public static int rechercheOccurences(String text, String toSearch) {
		int nbOccurences = 0;
		return nbOccurences;
	}
}
