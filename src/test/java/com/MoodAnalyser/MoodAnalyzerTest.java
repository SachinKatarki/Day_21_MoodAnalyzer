package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	  public void given_SadMood_Should_Return_Sad() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	        String mood = moodAnalyzer.MoodAnalyzer("I am In a Sad Mood");
	        Assert.assertEquals("SAD", mood);

	    }

}
