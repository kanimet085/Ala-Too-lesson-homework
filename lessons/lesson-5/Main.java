import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        

        // part 1

        // int n = 1111;
        // int x;
        // int attempt = 3;

        // do {
        //     System.out.print("введите пароль:  ");
        //     x = scanner.nextInt();
        //     if (x == n){
        //         System.out.print("Access granted!");
        //         break;
        //     } else if (attempt == 0){
        //         System.out.println("Incorrect PIN");
        //         System.out.println("banned");
        //         break;
        //     } else {
        //         // attempt--;
        //         System.out.println("Incorrect PIN");
        //         System.out.println("Attempts left:  " + attempt--);
        //     }
        // } while (attempt >= 0);
        

        

        // part 2

        // int bomb = 5;
        // int attempts = 5;
        // int flag;

        // do {
        //     System.out.print("choose a number from 1-10:   ");
        //     flag = scanner.nextInt();

        //     if (bomb == flag) {
        //         System.out.println("Correct!");
        //         break;
        //     } else if (flag < bomb){
        //         System.out.println("too low");
        //         attempts--;
        //         System.out.println("Attempts left: " + attempts);
        //     } else if (flag > bomb){
        //         System.out.println("too hight");
        //         attempts--;
        //         System.out.println("Attempts left: " + attempts);
        //     } else {
        //         attempts--;
        //         System.out.println("Attempts left: " + attempts);
        //     }
        // } while (attempts > 0);

        // part 3

        // int positiveCount = 0;
        // int negativeCount = 0;
        // int zeroCount = 0;
        // int evenCount = 0;
        // int oddCount = 0;
        // int attempts = 0;
    

        // System.out.println("Введите 10 чисел:");

        // do {
        //     attempts++; 
        //     System.out.print("Enter number " + attempts + ": ");
        //     int number = scanner.nextInt();

        //     if (number > 0) {
        //         positiveCount++;
        //     } else if (number < 0) {
        //         negativeCount++;
        //     } else {
        //         zeroCount++;
        //     }

        //     if (number % 2 == 0) {
        //         evenCount++;
        //     } else {
        //         oddCount++;
        //     }

        // } while (attempts < 10); 

        // System.out.println("===== STATISTICS =====");
        // System.out.println("Positive numbers: " + positiveCount);
        // System.out.println("Negative numbers: " + negativeCount);
        // System.out.println("Zeros: " + zeroCount);
        // System.out.println("Even numbers: " + evenCount);
        // System.out.println("Odd numbers: " + oddCount);
        
        
        
        
        scanner.close();
    }
}

