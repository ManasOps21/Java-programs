public class A27_square_number {
    public static void main(String[] args) {
        int range = 5;
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                // count = count * i;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
