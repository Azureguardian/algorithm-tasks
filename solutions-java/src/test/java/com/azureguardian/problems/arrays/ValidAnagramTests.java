package com.azureguardian.problems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTests {

    /*
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     */

    @Test
    public void anagram() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(new ValidAnagram().isAnagram(s, t));
    }

    @Test
    public void notAnagram() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(new ValidAnagram().isAnagram(s, t));
    }

    @Test
    public void anagramWithRepeatedCharacters() {
        String s = "carta";
        String t = "craat";
        Assertions.assertTrue(new ValidAnagram().isAnagram(s, t));
    }

    @Test
    public void anagramWithUnicode() {
        String s = "магазин";
        String t = "гинзаам";
        Assertions.assertTrue(new ValidAnagram().isAnagram(s, t));
    }
}
