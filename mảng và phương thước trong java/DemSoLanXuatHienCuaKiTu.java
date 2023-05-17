import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        String a = "aaaartyuioasdfghjklzxcvbnm";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("nhap vao ki tu ban muon kiem tra: ");
        String b = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
