import java.util.Scanner;

public class StudyPlanner {
    public static void main(String[] academ) {
        Scanner scanner = new Scanner(System.in);
        
        int weeklyGoal = 600;
        int progTime = 0, mathTime = 0, engTime = 0, otherTime = 0;
        int totalSessions = 0;
        int totalTime = 0;
        
        while (true) {
            System.out.println("===== STUDY Planner =====");
            System.out.println("1. Add study session");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            
            if (option == 1) {
                System.out.println("Choose subject:");
                System.out.println("1. Programming");
                System.out.println("2. Mathematics");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.print("Choose an option: ");
                int subject = scanner.nextInt();
                
                if (subject < 1 || subject > 4) {
                    System.out.println("Invalid subject choice.");
                    continue;
                }
                
                System.out.print("Study time in minutes: ");
                int minutes = scanner.nextInt();
                
                if (minutes <= 0) {
                    System.out.println("Invalid study time. Time must be greater than 0.");
                    continue;
                }
                
                // Распределение времени по предметам
                if (subject == 1) progTime += minutes;
                else if (subject == 2) mathTime += minutes;
                else if (subject == 3) engTime += minutes;
                else if (subject == 4) otherTime += minutes;
                
                totalTime += minutes;
                totalSessions++;
                System.out.println("Study session added!");
                System.out.println("Current total study time: " + totalTime + " minutes");
                
            } else if (option == 2) {
                System.out.println("===== WEEKLY STATISTICS =====");
                System.out.println("Study sessions: " + totalSessions);
                System.out.println("Total study time: " + totalTime + " minutes");
                System.out.println("Programming: " + progTime + " minutes");
                System.out.println("Mathematics: " + mathTime + " minutes");
                System.out.println("English: " + engTime + " minutes");
                System.out.println("Other: " + otherTime + " minutes");
                
            } else if (option == 3) {
                System.out.println("Weekly goal: " + weeklyGoal + " minutes");
                System.out.println("You studied: " + totalTime + " minutes");
                
                if (totalTime >= weeklyGoal) {
                    System.out.println("Weekly goal achieved!");
                } else {
                    int remaining = weeklyGoal - totalTime;
                    System.out.println("Remaining: " + remaining + " minutes");
                }
                
            } else if (option == 4) {
                System.out.println("Study Planner closed. Keep up the good work!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
