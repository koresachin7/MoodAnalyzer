package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Purpose - To perform mood analyser test cases
 * @author - Sachin Kore
 */
public class MoodAnalyserTest
{
    @Test
    public void iAmIn_SadMood_ShouldReturn_sad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad" , mood);
    }

}