import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        
        // Create an array to hold the numbers
        int[] a = new int[n + 1];  // +1 to account for the first element being the size
        
        // Read the elements into the array
        System.out.println("Enter the numbers: ");
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int prev = a[1] % 2;  // Check the parity of the first element

        // Loop through the array to count the number of times the pen is changed
        for (int i = 2; i <= n; i++) {
            if (a[i] % 2 != prev) {
                count++;
                prev = a[i] % 2;  // Update the previous value to the current element's parity
            }
        }
        
        // Print the result
        System.out.println("The total number of times the pen is changed is: " + count);
        
        // Close the scanner
        sc.close();
    }
}
