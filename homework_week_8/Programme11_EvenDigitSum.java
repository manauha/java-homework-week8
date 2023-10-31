package homework_week_8;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Programme11_EvenDigitSum {

    public static void getEvenDigitSum(int num) {
        int sum = 0, digit;
        int num1 = num;

        if (num < 0) {
            System.out.println("Invalid number return -1 ");
        } else {
            while (num != 0) {
                digit = num % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                num = num / 10;
            }
            System.out.println("Sum of even digit number " + num1 + " is " + sum);
        }
    }

    public static void input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Java programme returns sum of even digits of the number");
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        getEvenDigitSum(num);
        System.out.println("============= Other Inputs ==============");
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
        input.close();
    }

    public static void main(String[] args) {

        input();

    }
}
