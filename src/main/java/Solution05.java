/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


public class Solution05 {
    /*
    prompt user to enter a string
    read that string into num1 variable
    prompt user to enter a second string
    read that string into a num2 variable

    convert the two number strings into integers using parseint

    print the sum using num1 + num2
    print the difference using sum1 - sum2
    print the product using sum1 * sum2
    print the quotient using sum1 / sum2
     */


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String str1 = input.nextLine();
        System.out.print("What is the second number? ");
        String str2 = input.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", num1, num2, num1+num2, num1, num2, num1-num2, num1, num2, num1*num2, num1, num2, num1/num2);
    }
}