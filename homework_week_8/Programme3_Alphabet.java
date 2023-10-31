package homework_week_8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel or Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3_Alphabet {
    public void consonantOrVowel() {
        Scanner input = new Scanner(System.in); // scanner for user input

        System.out.print("Enter a single character from the alphabet : ");
        String stn = input.next();
        char s = stn.charAt(0); // String to character
        input.close(); // scanner close

        if (stn.length()>1){ // String length check
            System.out.println("Error: Length is greater than one character");
            return;

        } if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
            if ((s == 'a' || s == 'A') || (s == 'e' || s == 'E') || (s == 'i' || s == 'I') || (s == 'o' || s == 'O') || (s == 'u' || s == 'U')) {
                System.out.println("Entered character" + s + " is vowel");
            } else {
                System.out.println("Entered character" + s + " is consonant");
            }
        } else {

            System.out.println("Error : not an alphabet");
        }
    }

    public static void main(String[] args) {
        Programme3_Alphabet obj = new Programme3_Alphabet(); // object creation
        obj.consonantOrVowel();
    }
}
