import java.util.Scanner;

public class CubeSum {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take two integer inputs
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Check if m is greater than n
        if (m > n) {
            System.out.println(0);
        } else {
            // Calculate the sum of cubes from m to n
            int total = 0;
            for (int i = m; i <= n; i++) {
                total += i * i * i;  // Cube the current number and add to total
            }
            System.out.println(total);
        }
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
