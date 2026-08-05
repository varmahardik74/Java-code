import java.util.Scanner;

class Complex {
    private final double real;
    private final double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imag * other.imag);
        double newImag = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(newReal, newImag);
    }

    @Override
    public String toString() {
        String sign = imag >= 0 ? " + " : " - ";
        double absImag = Math.abs(imag);
        return String.format("%.2f%s%.2fi", real, sign, absImag);
    }
}

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first complex number (a b for a + bi): ");
        double aReal = scanner.nextDouble();
        double aImag = scanner.nextDouble();
        Complex c1 = new Complex(aReal, aImag);

        System.out.println("Enter second complex number (a b for a + bi): ");
        double bReal = scanner.nextDouble();
        double bImag = scanner.nextDouble();
        Complex c2 = new Complex(bReal, bImag);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("First:  " + c1);
        System.out.println("Second: " + c2);
        System.out.println("Sum:    " + sum);
        System.out.println("Diff:   " + diff);
        System.out.println("Prod:   " + product);

        scanner.close();
    }
}