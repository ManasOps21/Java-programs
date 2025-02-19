import java.util.Scanner;

public class A1_Read_number {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number :");
            String nun = sc.nextLine();
            try {
                int number = Integer.parseInt(nun);
                System.out.print("You have Entered : " + number);
            } catch (Exception e) {
                System.out.print("You have Entered : " + nun);
            }
            sc.close();
        }
    }
}