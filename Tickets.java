import java.util.Scanner;

public class ConcertAttendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int ticketCost = scanner.nextInt();

        // Output
        String result = determineAttendance(ticketCost);
        System.out.println(result);
        
        scanner.close();
    }

    // Function to determine concert attendance
    private static String determineAttendance(int ticketCost) {
        // Check if the total cost does not exceed 1000 rupees
        if (ticketCost * 4 <= 1000) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
