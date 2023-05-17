import java.util.Scanner;

public class HienThiCacLoaiHinh {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Enter your choose: ");
        int choose1 = Integer.parseInt(sc.nextLine());
        switch (choose1) {
            case 1:
                rectangle();
                break;
            case 2:
                System.out.println("1. The corner is square at top-left");
                System.out.println("2. The corner is square at top-right");
                System.out.println("3. The corner is square at botton-left");
                System.out.println("4. The corner is square at botton-right");
                int choose2 = Integer.parseInt(sc.nextLine());
                switch (choose2) {
                    case 1:
                        triangleTopLeft();
                        break;
                    case 2:
                        triangleTopRight();
                        break;
                    case 3:
                        triangleBottonLeft();
                        break;
                    case 4:
                        triangleBottonRight();
                        break;
                }
                break;
            case 3:
                isoscelesTriangle();
                break;
            case 4:
                break;
        }
    }

    public static void rectangle() {
        System.out.print("nhập chiều rộng: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("nhập chiều dài: ");
        int b = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleBottonLeft() {
        System.out.print("nhập chiều cao: ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleBottonRight() {
        System.out.print("nhập chiều cao: ");
        int a = Integer.parseInt(sc.nextLine());
        int b = a - 1;
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= b; k++) {
                System.out.print(" ");
            }
            b -= 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleTopLeft() {
        System.out.print("nhập chiều cao: ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleTopRight() {
        System.out.print("nhập chiều cao: ");
        int a = Integer.parseInt(sc.nextLine());
        int b = a - 1;
        for (int i = 1; i <= a; i++) {
            for (int k = 4; k > b; k--) {
                System.out.print(" ");
            }
            b -= 1;
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle() {
        System.out.print("nhap chieu cao: ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
