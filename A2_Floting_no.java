import java.util.Scanner;

public class A2_Floting_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers : ");
        String num = sc.nextLine();
        String numx = sc.nextLine();

        try {
            float fx = Float.parseFloat(num);
            float fxx = Float.parseFloat(numx);
            float mul = fx * fxx;
            System.out.print("Multiplied value is : " + mul);
        } catch (Exception e) {
            System.out.println("You have Entered String values: " + num + ", " + numx);
            System.out.println("There is another way to solve through ASCII value.");

            int sumNum = 0, sumNumx = 0;
            for (int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                System.out.println(ch + " : " + (int) ch);
                sumNum = sumNum + (int) ch;
            }

            for (int i = 0; i < numx.length(); i++) {
                char chx = numx.charAt(i);
                System.out.println(chx + " : " + (int) chx);
                sumNumx = sumNumx + (int) chx;
            }
            int multiply = sumNum * sumNumx;
            System.out.println("Multiplied ASCII values : " + num + " * " + numx + " :" + multiply);
        }
        sc.close();
    }
}
