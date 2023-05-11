import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập só tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23300;
        System.out.println("Giá trị VND : " + quydoi);
    }
}
