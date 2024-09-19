package developmentTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Products> items = new ArrayList<>();

        System.out.println("Enter product details (format: name, price, imported (true/false)) Type 'done' when finished:\n");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] details = input.split(",\\s*"); // Split by comma and optional whitespace
            if (details.length != 3) {
                System.out.println("Invalid input format. Please enter in the format: name, price, imported (true/false)");
                continue;
            }

            try {
                String name = details[0].trim(); // Remove extra whitespace
                double price = Double.parseDouble(details[1].trim());
                boolean imported = Boolean.parseBoolean(details[2].trim());
                items.add(new Products(name, price, imported));
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a valid number for the price.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        Receipt receipt = new Receipt(items);
        receipt.printReceipt();

        scanner.close();
    }
}
