package homework_week_8;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23; otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Programme13_SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean ans = false;


        if (num1 < 10 || num1 > 99) {
            ans = false;
        } else if (num2 < 10 || num2 > 99) {
            ans = false;
        } else {
            int lnum1 = num1 / 10;
            int rnum1 = num1 % 10;
            int lnum2 = num2 / 10;
            int rnum2 = num2 % 10;
            if (lnum1 == lnum2 || lnum1 == rnum2 || rnum1 == lnum2 || rnum1 == rnum2) {
                ans = true;
            }
        }
        return ans;
    }

    public static void main(String[] agrs) {

        System.out.println("Java programme check two user entered numbers have a shared digit");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first integer number between 10 and 99 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second integer number between 10 and 99 : ");
        int num2 = sc.nextInt();

        boolean ans = false;
        ans = hasSharedDigit(num1, num2);
        System.out.println("hasSharedDigit("+num1+","+num2+")-->"+ans);

        System.out.println("===============Other Example=================");
        ans = hasSharedDigit(12,23);
        System.out.println("hasSharedDigit("+num1+","+num2+")-->"+ans);
        ans= hasSharedDigit(9,99);
        System.out.println("hasSharedDigit("+num1+","+num2+")-->"+ans);
        ans =hasSharedDigit(15,55);
        System.out.println("hasSharedDigit("+num1+","+num2+")-->"+ans);
        sc.close();

    }
}

