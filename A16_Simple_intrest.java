import java.util.Scanner;

public class A16_Simple_intrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (% per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        scanner.close();

        // Simple Interest formula
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
