package com.example.android.jokes;

import java.util.Random;

public class Joke {

    private static String[] jokesArray = {
            "What's the difference between in-laws and outlaws? Outlaws are wanted.",
            "I bought the world's worst thesaurus yesterday. Not only is it terrible, it's terrible",
            "This is my step ladder. I never knew my real ladder.",
            "What's the difference between a good joke and a bad joke timing.",
            "I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day."
    };

    public static String generateRandomJoke() {

        String joke = jokesArray[getRandomNumberInRange(0, jokesArray.length-1)];

        return joke;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
