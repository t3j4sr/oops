import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to avoid case mismatch issues
        String original = str.toLowerCase();
        String reverse = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        // Check palindrome
        if (original.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }

        sc.close();
    }
}