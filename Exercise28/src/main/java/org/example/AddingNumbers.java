package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

public class AddingNumbers {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int i, number, sum = 0;
        for(i = 0; i <= 4; i++ )
        {
            System.out.print("Enter a number: ");
            number = scnr.nextInt();
            sum = sum + number;

        }
        System.out.print("The sum of the number is: " + sum);

    }

}
