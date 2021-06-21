package sber.meetup.kotlin.javacode;

public class Cast {
    public static void main(String[] args) {
        Object obj = "Hello, World";

        if (obj instanceof String) {

            String str = (String) obj;

            System.out.println(str.length());
        }
    }
}
