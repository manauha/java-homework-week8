package homework_week_8;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number. For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme6_NumberTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of row : ");
        int row = scanner.nextInt();
        Programme6_NumberTriangle obj = new Programme6_NumberTriangle();
        obj.numberTriangle(row);
        scanner.close();
    }

    public void numberTriangle(int row) {

        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}