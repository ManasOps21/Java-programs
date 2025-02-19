import java.util.Scanner;

public class A11_Leap_yr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        String year = sc.nextLine();
        try {
            int yr = Integer.parseInt(year);
            if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
                System.out.println("Leap year .");
            } else {
                System.out.println("Not a leap year .");
            }
        } catch (Exception e) {
            System.out.println("Enter a year agagin .");
        }
        sc.close();
    }
}
