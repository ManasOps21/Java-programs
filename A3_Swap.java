import java.util.Scanner;

public class A3_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers :");
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        try {
            int s1 = Integer.parseInt(n1);
            int s2 = Integer.parseInt(n2);
            System.out.print("Before Swap values ." + s1 + ", " + s2);
            s1 = s1 + s2;// 10=30
            s2 = s1 - s2;// 20=10=s2
            s1 = s1 - s2;// 30=20
            System.out.print("After Swap values ." + s1 + ", " + s2);
        } catch (Exception e) {
            System.out.println("You have entered string values .");
        }
        sc.close();
    }
}
