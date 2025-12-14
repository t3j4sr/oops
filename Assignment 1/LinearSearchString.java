import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // To consume leftover newline

        String[] arr = new String[n];

        // Input strings into array
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Search string
        System.out.print("Enter the string to search: ");
        String key = sc.nextLine();

        int position = -1;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (arr[i].equalsIgnoreCase(key)) { // Case insensitive comparison
                position = i;
                break;
            }
        }

        // Output
        if (position == -1) {
            System.out.println("String not found!");
        } else {
            System.out.println("String found at position: " + (position + 1));
        }

        sc.close();
    }
}