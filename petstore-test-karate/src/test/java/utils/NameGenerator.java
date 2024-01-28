package utils;

import java.util.Random;

public class NameGenerator {
    private static final String[] names = {"Buddy", "Daisy", "Max", "Lucy", "Charlie", "Molly"};

    private static Random random = new Random();
    public static String generatePetName() {
        String name = names[random.nextInt(names.length)];
        return name;
    }
}

