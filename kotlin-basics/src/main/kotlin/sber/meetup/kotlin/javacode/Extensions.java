// Java
// НЕТ ПРЯМОГО АНАЛОГА
package sber.meetup.kotlin.javacode;

public class Extensions {
    public static Character firstChar(String text) {
        return text.charAt(0);
    }

    public static void main(String[] args) {
        String text = "Hello, World";
        Character firstChar = Extensions.firstChar(text);

        System.out.println(firstChar);
    }
}
