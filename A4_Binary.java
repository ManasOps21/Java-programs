import java.math.BigInteger;

public class A4_Binary {
    public static void main(String[] args) {
        String binary1 = "1010"; // Example binary numbers
        String binary2 = "1101";

        BigInteger num1 = new BigInteger(binary1, 2); // Convert binary to decimal
        BigInteger num2 = new BigInteger(binary2, 2);
        BigInteger sum = num1.add(num2); // Perform addition

        System.out.println("Sum: " + sum.toString(2)); // Convert back to binary
    }
}
