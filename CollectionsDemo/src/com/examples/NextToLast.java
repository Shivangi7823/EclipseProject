package com.examples;


import java.util.Arrays;
import java.util.List;

public class NextToLast {
    public static String nextToLastWord(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s"));

        return words.get(words.size() - 2); 
    }

    public static void main(String[] args) {
        String sentence = "Hello, it would be pretty neat if I aced this interview with ease.";

        System.out.println(nextToLastWord(sentence));
    }
}