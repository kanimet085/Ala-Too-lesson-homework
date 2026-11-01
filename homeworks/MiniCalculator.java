import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        // scanner
         Scanner scanner = new Scanner(System.in);

        // // number-1
        // System.out.print("enter first number: ");
        // double firstNumber = scanner.nextDouble ();

        // // number-2
        // System.out.print("Enter second number: ");
        // double secondNumber = scanner.nextDouble();

        // // math 
        // double addition = firstNumber + secondNumber;
        // double subtraction = firstNumber - secondNumber;
        // double multiplication = firstNumber * secondNumber;
        // // double division = firstNumber / secondNumber;

        // // exemple

        // System.out.println("Addition: " + (int)firstNumber + " + " + (int)secondNumber + " = " + (int)addition);
        // System.out.println("Subtraction: " + (int)firstNumber + " - " + (int)secondNumber + " = " + (int)subtraction);
        // System.out.println("Multiplication: " + (int)firstNumber + " * " + (int)secondNumber + " = " + (int)multiplication);
        // // System.out.println("Division: " + (int)firstNumber + " / " + (int)secondNumber + " = " + division);

        // // x/0

        // if (secondNumber == 0) {
        //     System.out.println("division: на ноль делить нельзя!");
        // }

        // else {
        //     double division2 = firstNumber / secondNumber;
        //     System.out.println("division2: " + (int)firstNumber + "/" + (int)secondNumber + "=" + division2);
        // }

        // // scanner end

        System.out.print("choose a number1:  ");
        double calc1 = scanner.nextDouble();

        System.out.print("choose a operation: (+, -, *, /)  ");
        String oper = scanner.next(); 

        System.out.print("choose a number2:  ");
        double calc2 = scanner.nextDouble();

        if (oper.equals("+")){
            System.out.println("plast:  ");
            System.out.println(calc1 + calc2);
        }

        else if (oper.equals("-")){
            System.out.println("minos:  ");
            System.out.println(calc1 - calc2);
        }

        else if (oper.equals("*")){
            System.out.println("multiplication:  ");
            System.out.println(calc1 * calc2);
        }

        else if (oper.equals("/")){
            if (calc2 == 0){
                System.out.println("you cant division on zero");
            }   
            else{
                System.out.println("division:  ");
                System.out.println(calc1 / calc2);
                }
        }

        else 
            System.out.println("error");
        
            



        scanner.close();

    }
}