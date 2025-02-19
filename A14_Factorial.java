import java.util.*;

public class A14_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        try {
            int fact = 1;
            int num = Integer.parseInt(number);
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        } catch (Exception e) {
            System.out.println("Error.");
        }
        sc.close();
    }
}