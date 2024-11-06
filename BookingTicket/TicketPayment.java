import java.util.Scanner;

public class TicketPayment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input for quantity of tickets
        System.out.print("Enter how many tickets you want: ");
        int quantity = scanner.nextInt();

        // Initialize total amount
        int t_max = 0;

        // Loop through the number of tickets
        for (int i = 0; i < quantity; i++) {
            // Input for age of each person
            System.out.print("Enter age of person " + (i + 1) + ": ");
            int age = scanner.nextInt();

            // Add the appropriate price based on age
            if (age > 60) {
                t_max += 30;
            } else if (age < 12) {
                t_max += 20;
            } else {
                t_max += 50;
            }
        }

        // Output the total amount to be paid
        System.out.println("Total amount to be paid: " + t_max);
    }
}
