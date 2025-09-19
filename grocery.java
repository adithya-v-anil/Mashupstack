import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class grocery {
    

    public static double calculateTotal(int[] quantities, int[] prices) {
        double total = 0;
        for (int i = 0; i < quantities.length; i++) {
            total += quantities[i] * prices[i];
        }
      
        if (total > 500) {
            total = total - (total * 0.10);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] quantities = new int[items.length];

        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Available items and prices (per unit):");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - Rs." + prices[i]);
        }

        try {
            
            for (int i = 0; i < items.length; i++) {
                System.out.print("Enter quantity for " + items[i] + ": ");
                quantities[i] = sc.nextInt();
            }

            
            double finalAmount = calculateTotal(quantities, prices);

            
            System.out.println("\n--- BILL ---");
            for (int i = 0; i < items.length; i++) {
                if (quantities[i] > 0) {
                    System.out.println(items[i] + " x " + quantities[i] + " = Rs." + (quantities[i] * prices[i]));
                }
            }
            System.out.println("Final Amount: Rs." + finalAmount);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Date & Time of Purchase: " + now.format(format));

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}

