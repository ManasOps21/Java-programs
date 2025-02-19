class A5_Complex_num {
    double real, imaginary;

    A5_Complex_num(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    A5_Complex_num add(A5_Complex_num other) {
        return new A5_Complex_num(this.real + other.real, this.imaginary + other.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        A5_Complex_num num1 = new A5_Complex_num(3.5, 2.5);
        A5_Complex_num num2 = new A5_Complex_num(1.5, 4.5);
        A5_Complex_num sum = num1.add(num2);
        sum.display();
    }
}
