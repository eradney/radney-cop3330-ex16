/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        int age;
        final int LEGAL = 16;

        System.out.print("What is your age? ");
        age = scnr.nextInt();

        System.out.println("You are " + (age >= LEGAL ? "" : "not ") + "old enough to legally drive.");

    }
}
