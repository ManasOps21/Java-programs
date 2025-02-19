import java.util.Scanner;

public class A23_downward_star {
    public static void main(String[] args) {
        System.out.print("Enter a range : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = range; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
