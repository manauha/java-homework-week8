package homework_week_8;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * PRIME TESTING
 * The numbers from 0-9 have 1 digit,
 * so we don't want to process them; also we don't want to process negative numbers,
 * so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working correctly
 * for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */

public class Programme4_DigitSumChallenge {

    public static void sumDigits(int num){
        int rem, sum = 0;
        if (num >= 10) {
            while (num > 0){
                rem = num%10;
                sum = sum + rem;
                num = num/10;
            }
            System.out.println("Entered number's digits sum is : " + sum);
        } else{
            sum = -1;
            System.out.println(sum + ", Invalid input" );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner to take user input

        System.out.println("Java programme returns sum of the digits of given number");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        sumDigits(num);
        System.out.println("Enter number : -20");
        sumDigits(-20);
        System.out.println("Enter number : 8208");
        sumDigits(8208);
        System.out.println("Enter number : 7");
        sumDigits(7);
        scanner.close(); // scanner closing
    }
}
