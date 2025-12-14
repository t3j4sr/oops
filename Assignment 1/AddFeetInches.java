import java.util.Scanner;

public class AddFeetInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int feet1, inches1, feet2, inches2;

        // Input first measurement
        System.out.print("Enter first measurement - Feet: ");
        feet1 = scanner.nextInt();
        System.out.print("Enter first measurement - Inches: ");
        inches1 = scanner.nextInt();

        // Input second measurement
        System.out.print("Enter second measurement - Feet: ");
        feet2 = scanner.nextInt();
        System.out.print("Enter second measurement - Inches: ");
        inches2 = scanner.nextInt();

        // Add feet and inches
        int totalFeet = feet1 + feet2;
        int totalInches = inches1 + inches2;

        // Convert inches to feet if >= 12
        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches = totalInches % 12;
        }

        // Output result
        System.out.println("\nTotal Measurement = " + totalFeet + " feet " + totalInches + " inches");

        scanner.close();
    }
}