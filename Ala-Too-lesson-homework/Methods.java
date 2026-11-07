import java.util.Scanner;

public class Methods {

    // задание 1
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Ошибка: баалл между 1-100";
        }
       
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // задание 2 и задание 3

    // 1. Правый треугольник
    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Перевернутый правый треугольник  
    public static void printInvertedRightTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Пирамида 
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Перевернутая пирамида 
    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Числовой паттерн
    public static void printNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // выбор метода по номеру
    public static String getPatternName(int choice) {
        switch (choice) {
            case 1: return "Right Triangle";
            case 2: return "Inverted Right Triangle";
            case 3: return "Pyramid";
            case 4: return "Inverted Pyramid";
            case 5: return "Number Pattern";
            default: return "Unknown Pattern";
        }
    }

    // основной мэйн
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // задание 1 
        System.out.println("--- Задание 1 ---");
        System.out.println("Балл 95: " + calculateGrade(95)); 
        System.out.println("Балл 45: " + calculateGrade(45)); 
        System.out.println();

        // задание 3
        System.out.println("--- Задание 3 ---");
        System.out.print("Enter the number of rows: ");
        int size = scanner.nextInt();

        // вроверка
        if (size <= 0) {
            System.out.println("Ошибка: размер должен быть больше 0");
            scanner.close();
            return;
        }

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        System.out.println("Example Output:");
        System.out.println("Size: " + size);
        System.out.println("Pattern: " + getPatternName(choice));
        
        // Вызов нужной фигуры
        switch (choice) {
            case 1:
                printRightTriangle(size);
                break;
            case 2:
                printInvertedRightTriangle(size);
                break;
            case 3:
                printPyramid(size);
                break;
            case 4:
                printInvertedPyramid(size);
                break;
            default:
                System.out.println("Ошибка: неверно введено");
        }

        scanner.close();
    }
}
