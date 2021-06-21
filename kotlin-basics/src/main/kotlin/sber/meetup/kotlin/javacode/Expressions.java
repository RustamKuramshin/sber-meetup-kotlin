// Java
package sber.meetup.kotlin.javacode;

import java.util.Random;

public class Expressions {
    public static void main(String[] args) {
        // Пример с if else
        int randInt = new Random().nextInt();
        String numType;

        if (randInt%2 == 0) {
            numType = "even";
        } else {
            numType = "odd";
        }

        // Пример со switch case
        int randIntDiv = new Random().nextInt()%2;
        String numType2;

        switch (randIntDiv) {
            case 0:
                numType = "even";
                break;
            default:
                numType = "odd";
                break;
        }

        // Пример с try catch
        int randInt2;

        try {
            randInt2 = new Random().nextInt();
        } catch (Exception e) {
            randInt2 = 0;
        }
    }
}
