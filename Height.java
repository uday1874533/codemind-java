import java.util.Scanner;

public class FractionHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Output
        int height = findHeight(x, y);
        System.out.println(height);
        
        scanner.close();
    }

    // Function to find the height of x/y
    private static int findHeight(int x, int y) {
        // Height is the maximum of numerator and denominator
        return Math.max(x, y);
    }
}
