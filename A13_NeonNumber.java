import java.util.Scanner;

public class A13_NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if it's a Neon number
        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is NOT a Neon number.");
        }

        sc.close();
    }

    // Method to check Neon number
    public static boolean isNeon(int num) {
        int square = num * num; // Find square of the number
        int sum = 0;

        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;  // Compare sum with original number
    }
}
