package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.MoodAnalyzer("I am In Any Mood");
        Assert.assertEquals("HAPPY", mood);

    }

}
