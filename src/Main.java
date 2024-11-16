import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = -1;
        while (amount < 0) {
            System.out.print("Enter the amount of phone numbers (must be non-negative): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }
            amount = sc.nextInt();
            sc.nextLine();
        }

        ArrayList<String> phonebook = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            System.out.print("Enter the numbers under format (name: phone number): ");
            String phone = sc.nextLine();
            if (!phone.contains(":")) {
                System.out.println("Invalid format. Please use 'name: phone number'.");
                i--;
            } else {
                phonebook.add(phone);
            }
        }

        System.out.println();
        System.out.println("Here is your phonebook:");
        for (String entry : phonebook) {
            String[] parts = entry.split(":");
            String name = parts[0].trim();
            String phoneNumber = parts[1].trim();
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
        }

        sc.close();
    }
}
