import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Using the ternary operator to find max
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}