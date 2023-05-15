import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập giá trị muốn xoá khỏi mảng: ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}