package com.bridgelabz.mood.analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSAD_ShouldReturnSad() {
           MoodAnalyser moodAnalyser = new MoodAnalyser();
           String actualResult = moodAnalyser.analyseMood("I am sad");
           String expectedResult ="sad";
           Assert.assertEquals(expectedResult,actualResult);
    }


}


