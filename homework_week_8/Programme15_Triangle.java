package homework_week_8;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Programme15_Triangle {

    public void leftTriangle(int n) {

        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        Programme15_Triangle obj = new Programme15_Triangle();
        obj.leftTriangle(n);

        sc.close();

    }
}
