import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // basic setting

        boolean ban = false;
        int attempts = 3;
        int password = 1234;
        int balance = 1000;
        int pin = 0;
        int option = 0;
        // int depositAmount = 0;
        int deposit = 0;
        int withdraw = 0;

        do{
            System.out.println("===== SIMPLE ATM ====="); 

            System.out.print("");  // air

            System.out.print("Enter yout PIN:  ");
            pin = scanner.nextInt();
            if (pin == password){
                System.out.println("Login successful!");
                break;
            }  else {
                attempts--;
                System.out.println("Incorrect PIN");
                System.out.println("attempts remaining:  " + attempts);
                if (attempts == 0){
                    System.out.println("Your account has been blocked.");
                    ban = true;
                    break;
                }
            }
             
        } while (attempts > 0);
        
        if (ban){
            scanner.close();
            return;
        } 

        do{
            System.out.println("");  //air
            System.out.println("===== Menu ATM =====");
            System.out.println("Chek balance");  
            System.out.println("Deposit money");  
            System.out.println("Withdraw money");  
            System.out.println("Exit");  
            System.out.println("");  // air
            System.out.print("choose an option  ");  
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("your current balance is  " + balance + "$");
            } else if (option == 2){
                System.out.print("Enter deposit amount:  ");
                deposit = scanner.nextInt();
                System.out.println("deposit successful");
                System.out.println("your new balance is:  " + (balance + deposit) + "$");
                if (option == 2){
                    balance = balance + deposit;
                }
            } else if (option == 3){
                System.out.print("Enter withdraw amount:  ");
                withdraw = scanner.nextInt();
                if ((balance - withdraw) >= 0){
                    System.out.println("withdraw successful");
                    System.out.println("your new balance is:  " + (balance - withdraw) + "$");
                } else {
                    System.out.println("invalid");
                }
                if ((balance - withdraw) >= 0 && option == 3){
                    balance = balance - withdraw;
                }
            } else if (option == 4){
            System.out.println("Thank you for using Simpe ATM");
            break;
            } else {
                System.out.println("invalid option");
            }

        } while (option != 4);




     scanner.close();

    }
}
