import java.util.Scanner;

public class A7_Large_among {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Number : ");
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        String number3 = sc.nextLine();
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            int num3 = Integer.parseInt(number3);
            if (num1 > num2 && num1 > num3) {
                System.out.println("Number 1 is Greater ." + num1);
            } else if (num2 > num3) {
                System.out.println("Number 2 is greater ." + num2);
            } else {
                System.out.println("Number 3 is greater ." + num3);
            }
        } catch (Exception e) {
            int n1 = 0, n2 = 0, n3 = 0;
            System.out.println("You entered a String .");
            for (int i = 0; i < number1.length(); i++) {
                char c = number1.charAt(i);
                System.out.println(c + " : " + (int) c);
                n1 = n1 + (int) c;
            }
            for (int i = 0; i < number2.length(); i++) {
                char c2 = number2.charAt(i);
                System.out.println(c2 + " : " + (int) c2);
                n2 = n2 + (int) c2;
            }
            for (int i = 0; i < number3.length(); i++) {
                char c3 = number3.charAt(i);
                System.out.println(c3 + " : " + (int) c3);
                n3 = n3 + (int) c3;
            }
            if (n1 > n2 && n1 > n3) {
                System.out.println("First elements is larger ." + number1);
            } else if (n2 > n3) {
                System.out.println("Second elements is larger ." + number2);
            } else {
                System.out.println("Third elements is larger ." + number3);
            }
        }
        sc.close();
    }
}
