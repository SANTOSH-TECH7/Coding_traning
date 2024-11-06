import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of packets
        System.out.print("Enter the number of packets: ");
        int N = sc.nextInt();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Loop to take inputs
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a value: ");
            int temp = sc.nextInt();
            
            // Check if the value is not already in the list or it is zero
            if (!ans.contains(temp) || temp == 0) {
                ans.add(temp);
            }
        }
        
        // Sort the list
        Collections.sort(ans);
        
        // Count the number of zeros in the list
        int zeros = 0;
        for (int i = 0; i < N; i++) {
            if (ans.get(i) != 0) {
                break;
            }
            zeros++;
        }
        
        // Rearrange the list with zeros at the end
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = zeros; i < ans.size(); i++) {
            result.add(ans.get(i));
        }
        for (int i = 0; i < zeros; i++) {
            result.add(0);
        }
        
        // Output the result
        System.out.println(result);
        
        sc.close();
    }
}
