package com.company;
import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {
        // write your code here
        StringLengthLambda myStringLambda = s -> s.length();
        System.out.println(myStringLambda.getLength("HelloWorld"));

        List<Person> people =  Arrays.asList(
                new Person("Shweta", "Dhok", 30),
                new Person("Punit", "Chauhan", 31),
                new Person("Sonam", "Yadav", 35),
                new Person("Devanshi", "Cawande", 23)
        );
        ///Sort list by name  (comapartor is interface insstead by defining class and then implementaion I have inclass class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });
        // Create method that print all
        printall(people);
        printLastNameBeginningwithC(people);
    }

    private static void printLastNameBeginningwithC(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    private static void printall(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    interface StringLengthLambda {
        int getLength(String s);

    }
}