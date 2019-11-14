package com.company;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // write your code here


        List<Person> people = Arrays.asList(
                new Person("Shweta", "Dhok", 30),
                new Person("Punit", "Chauhan", 31),
                new Person("Sonam", "Yadav", 35),
                new Person("Devanshi", "Cawande", 23)
        );
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

    }
}
