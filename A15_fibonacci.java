import java.util.Scanner;

public class A15_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1, sum = 0;

        System.out.print("Fibonacci Series up to " + N + ": ");

        while (first <= N) {
            System.out.print(first + " ");
            sum += first;
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\nSum of Fibonacci numbers up to " + N + ": " + sum);
    }
}
