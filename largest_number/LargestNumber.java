import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
        // Create an ArrayList to store digits
        ArrayList<Integer> list_1 = new ArrayList<>();
        
        // Convert the number to a string and iterate through each character to extract digits
        for (char c : Integer.toString(n).toCharArray()) {
            list_1.add(Character.getNumericValue(c));
        }
        
        // Sort the digits in descending order
        Collections.sort(list_1, Collections.reverseOrder());
        
        // Initialize the variable to store the largest number
        int digit = 0;
        
        // Initialize the length to start from the highest power of 10
        int length = list_1.size() - 1;
        
        // Build the largest number by iterating through the sorted digits
        for (int i : list_1) {
            digit += i * Math.pow(10, length);  // Multiply by the corresponding power of 10
            length--;  // Decrease the length to move to the next lower power of 10
        }
        
        // Output the largest number
        System.out.println("The largest number is: " + digit);
        
        // Close the scanner
        scanner.close();
    }
}
