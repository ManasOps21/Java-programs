import java.util.Scanner;

public class A6_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        String number = sc.nextLine();
        try {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                System.out.println("Even number .");
            } else {
                System.out.println("Odd numbers .");
            }
        } catch (Exception e) {
            System.out.println("You entered a String .");
            for (int i = 0; i < number.length(); i++) {
                char c = number.charAt(i);
                System.out.println(c + " : " + (int) c);
                if (c % 2 == 0) {
                    System.out.println("\tEven number . ");
                } else {
                    System.out.println("\tOdd number .");
                }
            }
        }
        sc.close();
    }
}
