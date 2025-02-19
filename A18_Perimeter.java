import java.util.Scanner;

public class A18_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Width: ");
            double width = Double.parseDouble(sc.nextLine());

            if (length <= 0 || width <= 0) {
                System.out.println("Error: Length and Width must be positive numbers.");
            } else {
                double perimeter = 2 * (length + width);
                System.out.println("Perimeter of the Rectangle: " + perimeter);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } catch (Exception e) {
            System.out.println("Unexpected Error Occurred.");
        } finally {
            sc.close();
        }
    }
}
