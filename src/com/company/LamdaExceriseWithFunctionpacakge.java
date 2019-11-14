package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaExceriseWithFunctionpacakge {
    public static void main(String[] args) {
        // write your code here


        List<Person> people =  Arrays.asList(
                new Person("Shweta", "Dhok", 30),
                new Person("Punit", "Chauhan", 31),
                new Person("Sonam", "Yadav", 35),
                new Person("Devanshi", "Cawande", 23)
        );
        ///Sort list by name  (comapartor is interface it has one method so we can use it as functional lamda
        Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        // @Override
        // public int compare(Person p1, Person p2) {
        /// return p1.getLastName().compareTo(p2.getLastName());
        //}

        // Create method that print all
        System.out.println("Printing All persons");
        printall(people);
        System.out.println("Lambda expression for printing all names. I used the same printcontional method instead of printhall");
        printConditionally(people,p-> true, p-> System.out.println(p));
        System.out.println("Lastname Starts with C");
        printConditionally(people, p-> p.getLastName().startsWith("C"), p-> System.out.println(p));

        System.out.println("Lastname Starts with S");
        printConditionally(people, p-> p.getFirstName().startsWith("S") , p->System.out.println(p.getFirstName()));
        // @Override
        //  public boolean test(Person p) {
        //////  return p.getLastName().startsWith("C"); // implementation of cpondition if this comdition will pass it will print


    }
    //behaviour passed Condition

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
               consumer.accept(p);
            }
        }
    }

    private static void printall(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }


}


