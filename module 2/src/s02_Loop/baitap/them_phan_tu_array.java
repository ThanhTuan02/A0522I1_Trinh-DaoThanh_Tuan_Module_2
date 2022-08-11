package s02_Loop.baitap;


import java.util.Scanner;

public class them_phan_tu_array {
    public static void main(String[] args) {
        int n;
        int X;
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        n = sc.nextInt();
        for (int i = 1;i<= n;i++) {
            System.out.println("nhập số vào mảng" + i);
        }
        for (int i = 1; i <= n;i++) {
            System.out.println(a[i]);
        }
        System.out.println("nhập vị trí cần chèn");
        X = sc.nextInt();
    }
}
