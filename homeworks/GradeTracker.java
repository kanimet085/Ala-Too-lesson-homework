import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double assignmentPoints = 0;
        int assignmentCount = 0;
        double examPoints = 0;
        int examCount = 0;
        
        while (true) {
            System.out.println("===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            
            if (option == 1) {
                System.out.print("Enter assignment score: ");
                double score = scanner.nextDouble();
                
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    assignmentPoints += score;
                    assignmentCount++;
                    System.out.println("Assignment score added.");
                }
                
            } else if (option == 2) {
                System.out.print("Enter exam score: ");
                double score = scanner.nextDouble();
                
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    examPoints += score;
                    examCount++;
                    System.out.println("Exam score added.");
                }
                
            } else if (option == 3) {
                if (assignmentCount == 0 && examCount == 0) {
                    System.out.println("No results available yet.");
                    continue;
                }
                
                double assignmentAverage = 0;
                double examAverage = 0;
                double overallAverage = 0;
                
                if (assignmentCount > 0 && examCount > 0) {
                    assignmentAverage = assignmentPoints / assignmentCount;
                    examAverage = examPoints / examCount;
                    overallAverage = (assignmentAverage * 0.50) + (examAverage * 0.50);
                } else if (assignmentCount > 0) {
                    assignmentAverage = assignmentPoints / assignmentCount;
                    overallAverage = assignmentAverage; // Если экзаменов нет, берем среднее по домашним
                    System.out.println("(Note: Only assignment scores are available. Overall average is based on assignments only.)");
                } else {
                    examAverage = examPoints / examCount;
                    overallAverage = examAverage; // Если домашних нет, берем среднее по экзаменам
                    System.out.println("(Note: Only exam scores are available. Overall average is based on exams only.)");
                }
                
                char grade;
                if (overallAverage >= 90) grade = 'A';
                else if (overallAverage >= 80) grade = 'B';
                else if (overallAverage >= 70) grade = 'C';
                else if (overallAverage >= 60) grade = 'D';
                else grade = 'F';
                
                String status = (overallAverage >= 60) ? "Passing" : "Failing";
                
                System.out.println("===== CURRENT RESULTS =====");
                System.out.println("Assignments completed: " + assignmentCount);
                System.out.println("Assignment average: " + assignmentAverage);
                System.out.println("Exams completed: " + examCount);
                System.out.println("Exam average: " + examAverage);
                System.out.println("Overall average: " + overallAverage);
                System.out.println("Grade: " + grade);
                System.out.println("Status: " + status);
                
            } else if (option == 4) {
                System.out.println("Grade tracker closed.");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
