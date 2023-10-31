package homework_week_8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme8_rightAngleTriangle {

    public void triangle(int a){

        for(int m=1;m<=a;m++)
        {
            for(int n=1;n<=m; n++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows of @ : ");
        int a = input.nextInt();
        Programme8_rightAngleTriangle obj = new Programme8_rightAngleTriangle();
        obj.triangle(a);
        input.close();
    }
}
