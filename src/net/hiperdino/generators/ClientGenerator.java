package net.hiperdino.generators;

import java.util.Random;

public class ClientGenerator {
    private static final String[] clientNames = {
        "Tom",
        "Esther",
        "Martha",
        "Elisabeth",
        "Adam",
        "Kevin",
        "Jules",
        "Mark",
        "Anna",
        "Kyle",
        "Arthur",
        "Kendall",
        "Timmy",
        "Jennifer",
        "Natalie",
        "Bob",
        "Nancy",
        "Sheldon",
        "Dorothy",
        "Meg"
    };

    public static String obtainRandomName() {
        Random random = new Random();
        int randomName = random.nextInt(clientNames.length);
        return clientNames[randomName];
    }
}
