package com.company;

import java.util.Arrays;
import java.util.List;

public class ForEachLambaExample {
    public static void main(String[] args) {
        // write your code here


        List<Person> people =  Arrays.asList(
                new Person("Shweta", "Dhok", 30),
                new Person("Punit", "Chauhan", 31),
                new Person("Sonam", "Yadav", 35),
                new Person("Devanshi", "Cawande", 23));

        for (int i=0 ; i < people.size(); i++)
        {
            System.out.println("Normal For loop in Java 7 "+ people.get(i));
        }
     for(Person p : people)
     {
         System.out.println("Normal Foreach loop in Java 7 "+ p);
        }

     people.forEach( p -> System.out.println("Lambda Foreach loop in Java 8 "+ p));
     System.out.println("Method Lambda Example");
        people.forEach( System.out::println);

}}

