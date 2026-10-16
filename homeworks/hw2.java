import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // part 1

        // System.out.print("введите первое число: "); 
        // int n1 = scanner.nextInt();

        // System.out.print("введите второе число: "); 
        // int n2 = scanner.nextInt();

        // System.out.print("введите третье число: "); 
        // int n3 = scanner.nextInt();

        // int max = n1;

        // if (n2 > max) {
        //     max = n2;
        // }
        // if (n3 > max) {
        //     max = n3;
        // }

        // System.out.println("Наибольшее число: " + max);

        // part 2

        // System.out.println();     // просто пустая строка
        // System.out.print("введите свой возраст: ");
        // int age = scanner.nextInt();

        // if (age >= 18) {
        //     System.out.println("разрешено");
        // } else {
        //     System.out.println("запрещено");
        // }

        // Part 3

        // System.out.println();     // просто пустая строка
        // System.out.print("введите число: ");
        // int d1 = scanner.nextInt();

        // if (d1 % 2 == 0) {
        //     System.out.println("четное");
        // } else {
        //     System.out.println("нечетное");
        // }

        // part 4

        // System.out.println();     // просто пустая строка
        // System.out.print("выберите первое число: ");
        // double calc1 = scanner.nextDouble();

        // System.out.print("выберите операцию (+, -, *, /): ");
        // String operation = scanner.next();

        // System.out.print("выберите второе число: ");
        // double calc2 = scanner.nextDouble();

        // if (operation.equals("+")) {
        //     System.out.print("операция: сложения, результат: ");
        //     System.out.println(calc1 + calc2);
        // } 
        // else if (operation.equals("-")) {
        //     System.out.print("операция: вычитания, результат: ");
        //     System.out.println(calc1 - calc2);
        // } 
        // else if (operation.equals("*")) {
        //     System.out.print("операция: умножения, результат: ");
        //     System.out.println(calc1 * calc2);
        // } 
        // else if (operation.equals("/")) {
        //     if (calc2 == 0) {
        //         System.out.println("ошибка при делении на 0");
        //     } else {
        //         System.out.print("операция: деления, результат: ");
        //         System.out.println(calc1 / calc2);
        //     }
        // } 
        // else {
        //     System.out.println("неправильная операция");
        // }

        //  part 5
        // System.out.print("Введите баллы за посещаемость (max 10): ");
        // int attendance = scanner.nextInt();
        // System.out.print("Введите баллы за домашнее задание (max 60): ");
        // int homework = scanner.nextInt();
        // System.out.print("Введите баллы за экзамен (max 30): ");
        // int exam = scanner.nextInt();

        // int total = attendance + homework + exam;
        // System.out.println("Общий балл: " + total);

        // if (total > 65 && attendance >= 6 && exam >= 17) {
        //     System.out.println("Результат: Passed");
        // } else {
        //     System.out.println("Результат: Failed");
        // }

        // part 6
        // System.out.print("введите свой возраст:  ");
        // int age = scanner.nextInt();
        // System.out.print("введите свой доход:  ");
        // int montlyIncome = scanner.nextInt();
        // System.out.print("введите свой кредитные баллы:  ");
        // int creditScore = scanner.nextInt();
        // System.out.print("введите свой опыт работы:  ");
        // int exp = scanner.nextInt();
        // System.out.print("есть ли у вас кредиты(true or false):  ");
        // boolean creditNow = scanner.nextBoolean();

        // boolean apruveAge = (age >= 21 && age <= 65);
        // boolean expCreditNow = (exp >= 2 || creditNow == false);

        // if (apruveAge && montlyIncome >= 30000 && creditScore >= 70 && expCreditNow){
        //     System.out.println("result:  approved");
        // } else {
        //     System.out.println("result:  rejected");
        // }

        // part 7

        // System.out.print("Вы премиум-клиент? (true/false): ");
        // boolean premium = scanner.nextBoolean();

        // System.out.print("У вас есть купон на скидку? (true/false): ");
        // boolean discountCoupon = scanner.nextBoolean();

        // System.out.print("Сейчас месяц вашего рождения? (true/false): ");
        // boolean birthdayMonth = scanner.nextBoolean();

        // System.out.print("Введите общую сумму покупки: ");
        // int totalPrice = scanner.nextInt();

        // System.out.print("Количество ваших предыдущих заказов: ");
        // int basket = scanner.nextInt();

        // System.out.println("Исходная цена:  " + totalPrice);

        // // Challenge:
        // if (totalPrice < 20) {
        //     System.out.println("Скидка: 0% (Сумма покупки меньше $20)");
        //     System.out.println("Общая стоимость:  " + totalPrice);
        // } 

        // else if (totalPrice >= 200 && premium && (birthdayMonth || discountCoupon)) {
        //     System.out.println("Скидка: 20%");
        //     System.out.println("Общая стоимость:  " + (totalPrice - (totalPrice * 20) / 100));
        // } 

        // else if (totalPrice >= 150 && (basket >= 10 || premium)) {
        //     System.out.println("Скидка: 15%");
        //     System.out.println("Общая стоимость:  " + (totalPrice - (totalPrice * 15) / 100));
        // } 

        // else if (totalPrice >= 100 && discountCoupon) {
        //     System.out.println("Скидка: 10%");
        //     System.out.println("Общая стоимость:  " + (totalPrice - (totalPrice * 10) / 100));
        // } 

        // else {
        //     System.out.println("Скидка: 0%");
        //     System.out.println("Общая стоимость:  " + totalPrice);
        // }

        // lab 3

        // part 1

        // int i = 1;

        // while(i < 1000) {
        //     System.out.println("before:  " + i);

        //         i *= 10;

        //     System.out.println("after:  " + i);
        // }

        // part 2

        // for (int i = 1; i < 1000; ){
        //     System.out.println("before:  " + i);

        //         i *= 10;

        //     System.out.println("after:  " + i);
        // }

        // part 3

        // System.out.print("введите число:  ");
        // int n = scanner.nextInt();

        // int x = 1;  

        // while (x <= n){
        //     System.out.println(x);
        //     x++;
        // }

        // for ( ; x <= n; x++){
        //     System.out.println(x);
        // }

        // do {
        //     System.out.println(x);
        //     x++;
        // }  while( x <= n);

        // part 4

        // while (n > 0){
        //     System.out.print(n);
        //     n++;
        // }

        // part 5

        // while (x <= n){
        //     if (x % 2 == 0){
        //         System.out.println(x);
        //     }       
        //     x++;
        // }

        // for ( ; x <= n; x++){
        //     if (x % 2 == 0){
        //         System.out.println(x);
        //     }  
        // }

        // do{
        //     System.out.println(x);
        //     x++;
        // } while ( x <= n && x % 2 == 0);

        // part 6

        // while (x <= n){
        //     if (x % 2 == 1){
        //         System.out.println(x);
        //     }       
        //     x++;
        // }

        // part 7

        // for (x = 1;x <= 20; x++){
        //     if (x % 5 == 0 && x % 3 == 0){
        //         System.out.println("FizzBuzz;  " + x);
        //     } else if (x % 3 == 0){
        //         System.out.println("Fuzz;  " + x);
        //     }  else if (x % 5 == 0){
        //         System.out.println("Bizz;  " + x);
        //     }
        // }
        
        
        scanner.close();
    }
}
