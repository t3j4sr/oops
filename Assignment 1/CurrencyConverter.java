import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Currency names
        String[] currency = {"INR", "USD", "EURO", "POUND", "AUD"};

        // Conversion rates (Base: INR)
        // Values represent: 1 unit of currency in INR
        double[] rate = {1.0, 83.0, 90.0, 105.0, 55.0};

        System.out.println("Currency Options:");
        System.out.println("0 = INR");
        System.out.println("1 = USD");
        System.out.println("2 = EURO");
        System.out.println("3 = POUND");
        System.out.println("4 = AUD");

        System.out.print("\nEnter the currency you want to convert FROM (0-4): ");
        int from = sc.nextInt();

        System.out.print("Enter the currency you want to convert TO (0-4): ");
        int to = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if(from < 0 || from > 4 || to < 0 || to > 4) {
            System.out.println("Invalid selection!");
        } else {
            // Calculate conversion
            double result = (amount * rate[from]) / rate[to];
            System.out.printf("\n%.2f %s = %.2f %s\n", amount, currency[from], result, currency[to]);
        }

        sc.close();
    }
}