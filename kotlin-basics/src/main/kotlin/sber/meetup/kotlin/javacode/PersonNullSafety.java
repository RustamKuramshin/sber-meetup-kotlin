// Java
package sber.meetup.kotlin.javacode;

import java.util.Optional;

public class PersonNullSafety {

    public Optional<String> name;

    public PersonNullSafety(String name) {
        this.name = Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        PersonNullSafety personNullSafety = new PersonNullSafety("John Doe");

        personNullSafety.name.ifPresent(p -> {
            System.out.println(p.length());
        });

        System.out.println(personNullSafety.name.isPresent());

        System.out.println(personNullSafety.name.get().length());
    }
}
