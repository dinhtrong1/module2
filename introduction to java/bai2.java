import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String b = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần đọc: ");
        int a = Integer.parseInt(sc.nextLine());
        if (a < 10 && a >= 0) {
            switch (a) {
                case 1:
                    b = "one";
                    break;
                case 2:
                    b = "two";
                    break;
                case 3:
                    b = "three";
                    break;
                case 4:
                    b = "four";
                    break;
                case 5:
                    b = "five";
                    break;
                case 6:
                    b = "six";
                    break;
                case 7:
                    b = "seven";
                    break;
                case 8:
                    b = "eight";
                    break;
                case 9:
                    b = "nine";
                    break;
            }
        } else if (a < 20 && a >= 10) {
            switch (a) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
            }
        } else if (a >= 20 && a < 100) {
            if (a < 30) {
                b = "twenty";
            } else if (a < 40) {
                b = "thirty";
            } else if (a < 50) {
                b = "fourty";
            } else if (a < 60) {
                b = "fifty";
            } else if (a < 70) {
                b = "sixty";
            } else if (a < 80) {
                b = "seventy";
            } else if (a < 90) {
                b = "eighty";
            } else if (a < 100) {
                b = "ninety";
            }
            if (a > 20) {
                if (a % 10 == 1) {
                    b += " one";
                }
                if (a % 10 == 2) {
                    b += " two";
                }
                if (a % 10 == 3) {
                    b += " three";
                }
                if (a % 10 == 4) {
                    b += " four";
                }
                if (a % 10 == 5) {
                    b += " five";
                }
                if (a % 10 == 6) {
                    b += " six";
                }
                if (a % 10 == 7) {
                    b += " seven";
                }
                if (a % 10 == 8) {
                    b += " eight";
                }
                if (a % 10 == 9) {
                    b += " nine";
                }
            }
        }
        System.out.println(b);
    }
}
