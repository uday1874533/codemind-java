import java.util.Scanner;

public class TankFillTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int rateA = scanner.nextInt();  // Rate of Tap A
        int rateB = scanner.nextInt();  // Rate of Tap B

        // Output
        int fillTime = calculateFillTime(rateA, rateB);
        System.out.println(fillTime);
        
        scanner.close();
    }

    // Function to calculate fill time
    private static int calculateFillTime(int rateA, int rateB) {
        // Formula: 1 / (1/A + 1/B) = A * B / (A + B)
        return (rateA * rateB) / (rateA + rateB);
    }
}
