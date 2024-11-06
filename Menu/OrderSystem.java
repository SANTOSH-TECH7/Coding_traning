import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class OrderSystem {
    public static void main(String[] args) {
        // Menu items with their prices
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 200);
        menu.put("burger", 250);
        menu.put("Biriyani", 250);
        
        System.out.println("Menu:");
        
        // Print the menu
        for (String item : menu.keySet()) {
            System.out.println(item + " : " + menu.get(item));
        }

        // List to store orders
        ArrayList<String> orderedList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // Taking orders
        while (true) {
            System.out.print("Order (yes or no): ");
            String choice = sc.nextLine();
            
            if (choice.equals("yes")) {
                System.out.print("Enter the food you want to order: ");
                String order = sc.nextLine();
                System.out.print("Enter how many plates: ");
                int q = Integer.parseInt(sc.nextLine());
                
                // Append order to the list
                for (int i = 0; i < q; i++) {
                    orderedList.add(order);
                }
            } else if (choice.equals("no")) {
                System.out.println("Thank you!!!");
                break;
            }
        }
        
        // Calculate the total amount
        int totalAmt = 0;
        for (String order : orderedList) {
            totalAmt += menu.get(order);  // Add the price of each order to the total
        }
        
        // Apply discount if total amount is greater than 500
        if (totalAmt > 500) {
            System.out.println("You have a 10% discount for the orders");
            totalAmt *= 0.9;
            System.out.println("The discounted amount to be paid: " + totalAmt);
        }

        // Print the total amount
        System.out.println("The total amount for the order is: " + totalAmt);
        
        sc.close();
    }
}
