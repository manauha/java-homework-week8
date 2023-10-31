package homework_week_8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme9_FibonacciNumbers {

    public static void main(String[] args) {
        input();

    }

    public static void input() {
        System.out.println("Fibonacci sequence numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length of Fibonacci sequence numbers: ");
        int num = sc.nextInt();
        fibonacci(num);
        sc.close();
    }

    public static void fibonacci(int num) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print("First " + num +" numbers of  Fibonacci sequence are: " + n1 + " " + n2);
        for (int i = 2; i < num; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}


