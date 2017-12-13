package com.example.javajokelibrary;

import java.util.Random;

public class JavaJoke {

    private String[] badJokes;
    private Random random;

    public JavaJoke() {
        badJokes = new String[4];
        badJokes[0] = "To err is human - and to blame it on a computer is even more so.";
        badJokes[1] = "Artificial intelligence usually beats real stupidity.";
        badJokes[2] = "If you think patience is a virtue, try surfing the net on a 14.4k dial up connection.";
        badJokes[3] = "If at first you don't succeed, call it version 1.0.";
        random = new Random();
    }

    public String getBadJokes() {
        return badJokes[random.nextInt(badJokes.length)];
    }
}