// Java program to find numbers dividable 3

package com.numbers;

import java.util.LinkedList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating linked list to store numbers
        List <Integer> list = new LinkedList<>();

        // Filling out list with numbers
        for (int index = 0; index < 100; index++) {
            list.add(index);
        }

        // Checking if numbers are dividable by 3
        for (int index = 0; index < 100 ; index++) {

            // Condition
            if (list.get(index) % 3 == 0) {

                // Printing result to console
                System.out.println(list.get(index) + " is dividable by 3");
            } else {

                // Printing result to console
                System.out.println(list.get(index) + " is not dividable by 3");
            }
        }
    }
}