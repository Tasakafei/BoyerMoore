package main;

import java.util.HashMap;
import java.util.Map;

public class BadMatchTable {
    private Map<Character, Integer> mapTable;
    private int length;

    public BadMatchTable(String subString) {
        length = subString.length();
        mapTable = new HashMap<>();
        for (int i = 0; i < subString.length() - 1; i++) {
            mapTable.put(subString.charAt(i), subString.length() - 1 - i);
        }
    }

    public int getShift(char c) {
        return mapTable.getOrDefault(c, length);
    }

    @Override
    public String toString() {
        return mapTable.toString();
    }

    public static void main(String[] args) {
        BadMatchTable bmt = new BadMatchTable("aaa");
        System.out.println(bmt);
    }
}
