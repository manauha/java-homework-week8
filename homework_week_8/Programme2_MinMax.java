package homework_week_8;

import java.util.Scanner;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme2_MinMax {
    public void minMax(){
        Scanner input =new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number - enter invalid number to break the loop : ");
            if(input.hasNextInt()){ // confirm input is number
                int n = input.nextInt();
                if(n>max){
                    max = n;
                }
                if(n< min){
                    min = n;
                }
            } else {
                System.out.println("Minimum number is: " + min); // output
                System.out.println("Maximum number is: "+ max);
                break;
            }
        }
        input.close(); // scanner close
    }

    public static void main(String[] args) {
        ////objecting creation and calling the method
        Programme2_MinMax obj = new Programme2_MinMax();
        obj.minMax();
    }
}
