import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // базовый setting
        final int CORRECT_PIN = 1234;    
        double balance = 1000.0;
        
        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("===== SIMPLE ATM =====");

        // авторизация
        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Login successful!");
                loggedIn = true;
                break; 
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");
                if (attempts > 0) {
                    System.out.println("Remaining attempts: " + attempts);
                } else {
                    System.out.println("Your account has been blocked.");
                }
            }
        }

        if (!loggedIn) {
            scanner.close();
            return;                  
        }

        int option = 0;
        do {
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

                // баланс
            if (option == 1) {
                System.out.println("Your current balance is: $" + balance);

            } else if (option == 2) {
                // + наличных
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();

                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful.");
                    System.out.println("Your new balance is: $" + balance);
                } else {
                    System.out.println("Invalid amount. Deposit must be greater than zero.");
                }

            } else if (option == 3) {
                // - наличных
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount <= 0) {
                    System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                } else if (withdrawAmount > balance) {
                    System.out.println("Invalid amount. Insufficient funds.");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Your new balance is: $" + balance);
                }

            } else if (option == 4) {
                // Выход
                System.out.println("Thank you for using Simple ATM!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);

        scanner.close();
    }
}
