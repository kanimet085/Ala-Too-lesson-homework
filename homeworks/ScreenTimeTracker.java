import java.util.Scanner;

public class ScreenTimeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int socialMediaTime = 0, gamingTime = 0, studyingTime = 0, streamingTime = 0;
        int totalSessions = 0;
        int totalScreenTime = 0;
        
        while (true) {
            System.out.println("===== SCREEN-TIME TRACKER =====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            
            if (option >= 1 && option <= 4) {
                String categoryName = "";
                if (option == 1) categoryName = "social media";
                else if (option == 2) categoryName = "gaming";
                else if (option == 3) categoryName = "studying";
                else if (option == 4) categoryName = "video or streaming";
                
                System.out.print("Enter " + categoryName + " minutes: ");
                int minutes = scanner.nextInt();
                
                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                    continue;
                }
                
                if (option == 1) socialMediaTime += minutes;
                else if (option == 2) gamingTime += minutes;
                else if (option == 3) studyingTime += minutes;
                else if (option == 4) streamingTime += minutes;
                
                totalScreenTime += minutes;
                totalSessions++;
                System.out.println("Time added successfully!");
                
            } else if (option == 5) {
                System.out.println("===== TODAY'S SCREEN TIME =====");
                System.out.println("Social media: " + socialMediaTime + " minutes");
                System.out.println("Gaming: " + gamingTime + " minutes");
                System.out.println("Studying: " + studyingTime + " minutes");
                System.out.println("Streaming: " + streamingTime + " minutes");
                System.out.println("Total screen time: " + totalScreenTime + " minutes");
                System.out.println("Recorded sessions: " + totalSessions);
                
                int entertainmentTime = socialMediaTime + gamingTime + streamingTime;
                if (studyingTime > entertainmentTime) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                } else if (entertainmentTime > studyingTime) {
                    System.out.println("Entertainment screen time is greater than study time.");
                } else {
                    System.out.println("Study and entertainment screen time are equal.");
                }
                
                if (totalScreenTime < 120) {
                    System.out.println("Screen time category: Low screen time");
                } else if (totalScreenTime <= 240) {
                    System.out.println("Screen time category: Moderate screen time");
                } else {
                    System.out.println("Screen time category: High screen time");
                }
                
            } else if (option == 6) {
                System.out.println("Screen-time tracker closed.");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
