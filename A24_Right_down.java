public class A24_Right_down {
    public static void main(String[] args) {
        int range = 5;
        for (int i = range; i >= 1; i--) {
            for (int j = 1; j <= range - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
