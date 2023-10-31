package homework_week_8;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number.
 * Continue reading until you have read PRIME TESTING 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would Enter number #1:, the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class Programme1_ReadingUserInputChallenge {
    public void p1(){
        int x=0, sum = 0;
        Scanner input = new Scanner(System.in);  // scanner for user input
        while (x++ < 10){ // counting 10 valid inputs
            System.out.print("Enter number " + x + " : ");
            while(!input.hasNextInt()){ // confirms entered value is an integer
                System.out.println("Invalid number, Enter a number again");
                input.next(); // taking input from user
            }
           int num = input.nextInt();
            sum = sum + num; // sum of valid numbers
        }
        System.out.println("The sum of 10 entered is : " + sum); // output
        input.close(); // scanner closing
    }

    public static void main(String[] args) {

        System.out.println("Java programme to find the sum of user entered integer numbers");
        //objecting creation and calling the method
        Programme1_ReadingUserInputChallenge obj = new Programme1_ReadingUserInputChallenge();
        obj.p1();
    }
}
