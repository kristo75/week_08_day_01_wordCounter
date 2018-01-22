package com.example.user.wordcounter;

/**
 * Created by user on 22/01/2018.
 */

public class WordCounter {
    String words;

    public WordCounter(String words){
        this.words = words;
    }

    public int countAnswer() {
        String[] result = words.split(" ");
        return result.length;
    }
}
