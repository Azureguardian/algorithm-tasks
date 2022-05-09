package com.azureguardian.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;

        ArrayList<String> sourceCharacters = new ArrayList<String>(Arrays.asList(s.split("")));
        for (String character : t.split("")) {
            if (!sourceCharacters.contains(character)) return false;
            sourceCharacters.remove(character);
        }
        return sourceCharacters.size() == 0;
    }
}
