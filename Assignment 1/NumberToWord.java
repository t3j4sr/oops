import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        // Array to store the word equivalents of digits 0-9
        String[] words = {
            "Zero", "One", "Two", "Three", "Four", 
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0-9: ");
        int num = scanner.nextInt();

        // Validate input
        if(num >= 0 && num <= 9) {
            System.out.println("Word equivalent: " + words[num]);
        } else {
            System.out.println("Invalid input! Please enter a number from 0 to 9.");
        }

        scanner.close();
    }
}   