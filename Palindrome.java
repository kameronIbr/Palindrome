// Palindrome.java
// Kameron Ibraheem
// Lab03: Palindrome
//
//

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take a word from the user
        System.out.print("Enter a word or a phrase: ");
        String userInput = scanner.nextLine();

        // variable to store whether it is a palindrome
        String result = userInput + " is a palindrome!";

        // for loop to compare characters from start and end
        int length = userInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (userInput.charAt(i) != userInput.charAt(length - 1 - i)) {
                result = userInput + " is not a palindrome.";
                break;
            }
        }

        // print the result
        System.out.println(result);
    }
}
