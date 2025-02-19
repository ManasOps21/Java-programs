import java.util.Scanner;

public class A22_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The range :");
        int range = sc.nextInt();
        for (int i = range; i >= 1; i--) {
            // Printing spaces
            for (int j = 1; j <= range - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {
                // System.out.print(" *5");
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
