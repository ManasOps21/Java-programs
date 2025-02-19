import java.util.Scanner;

public class A10_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        String number = sc.nextLine();
        int count = 0;
        try {
            int num = Integer.parseInt(number);
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime number .");
            } else {
                System.out.println("Not a prime number .");
            }
        } catch (Exception e) {
            System.out.println("Enter a Numb er again .");
        }
        sc.close();
    }
}
