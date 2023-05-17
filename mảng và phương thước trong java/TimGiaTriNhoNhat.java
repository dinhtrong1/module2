import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size;
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu trong mang: ");
        size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("nhap gia tri phan tu %d ", i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.printf("phan tu nho nhat trong mang la : %d", min);
    }
}
