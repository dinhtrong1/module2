import java.util.Scanner;

public class TongCacSoODuongCheo {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][i];
                }
                //đường chéo thứ hai
//                if (i+j==arr.length-1){
//                    sum += arr[i][j];
//                }
            }
        }
        System.out.println(sum);
    }
}
