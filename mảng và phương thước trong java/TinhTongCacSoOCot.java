import java.util.Scanner;

public class TinhTongCacSoOCot {
    public static void main(String[] args) {
        int a, b, c, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong gia tri mang chieu thu nhat: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("nhap so luong gia tri mang chieu thu hai: ");
        b = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("nhap gia tri tai vi tri arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.print("ban muon tinh tong cac so o cot nao: ");
        c = Integer.parseInt(sc.nextLine()) - 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][c];
        }
        System.out.printf("tong cac so cot %d: %d", c + 1, sum);
    }
}
