package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/01/2018.
 */

public class WordCountTest {
    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter("count these words");
    }

    @Test
    public void canCountWords(){
        assertEquals(3, wordCounter.countAnswer());
    }
}
