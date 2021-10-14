package com.bridgelabz;
/**
 * Purpose - To implement mood analyser program by handling custom exceptions
 * @author - Sachin Kore
 * @version - 16.0
 */
public class MoodAnalyser
{
    private String message;

    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message)
    {

        if(message.contains("sad"))
            return "sad";
        else
            return "Happy";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser");

    }
}