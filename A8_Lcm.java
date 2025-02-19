import java.util.Scanner;

public class A8_Lcm {
    // Method to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // Using LCM formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print LCM
        int lcm = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}