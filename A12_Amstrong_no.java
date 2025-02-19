import java.util.Scanner;

public class A12_Amstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if it's an Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Compute sum of digits raised to power of number of digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNum; // Return true if Armstrong number
    }
}
