package homework_week_8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme10_ArmstrongNumbers {

    public static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong number : ");
        int num = input.nextInt();
        input.close();
        if (armstrong(num)) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num +" is not Armstrong number");
        }
    }

    static boolean armstrong(int num) {
        int temp, digits = 0, last, sum = 0;
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            last = temp % 10;
            sum += (int) Math.pow(last, digits);
            temp = temp / 10;
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        input();
    }

}
