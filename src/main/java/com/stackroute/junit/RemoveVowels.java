package com.stackroute.junit;

public class RemoveVowels {
    //method to remove vowels from a String
    public static String[] removeVowels(String[] input) {
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("[aeiou]", "");

        }
        return input;
    }
}
