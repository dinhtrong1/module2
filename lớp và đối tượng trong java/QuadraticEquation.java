import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        if (pt.getDiscriminant() > 0) {
            System.out.printf("phương trình có hai nghiệm: %.3f và %.3f", pt.getRoot1(), pt.getRoot2());
        } else if (pt.getDiscriminant() == 0) {
            System.out.printf("phương trình có nghiệm kép: %f.3", pt.getRoot2());
        } else {
            System.out.print("phương trình vô nghiệm");
        }
    }

    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double r1 = 0;
        if (this.getDiscriminant() >= 0) {
            r1 = (-b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
        } else if (this.getDiscriminant() < 0)
            return 0;
        return r1;
    }

    public double getRoot2() {
        double r2 = 0;
        if (this.getDiscriminant() >= 0) {
            r2 = (-b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
        } else if (this.getDiscriminant() < 0)
            return 0;
        return r2;
    }

}
