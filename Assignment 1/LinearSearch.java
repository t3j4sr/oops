import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Search element
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int position = -1;

        // Linear search logic
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                position = i;
                break;
            }
        }

        // Output result
        if(position == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at position: " + (position + 1));
        }

        sc.close();
    }
}