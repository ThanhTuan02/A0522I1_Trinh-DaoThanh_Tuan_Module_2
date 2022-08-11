package s02_Loop.baitap;

import java.util.Scanner;

public class xoa_phan_tu_array {
    public static void main(String[] args) {
        int N;
        int x;
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số vào đây");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("nhập index " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(array[i]);
        }
        System.out.println("nhập vị trí cần xóa");
        x = sc.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == x) {
                for (int i = j; i < array.length; i++) {
                    if (i == (array.length) - 1) {
                        array[i] = 0;
                    } else {
                        array[i] = array[i + 1];
                    }
                }
                break;
            }
        }
        System.out.println("kêt quả sau khi xóa mảng");
        for (int i = 1; i <= N; i++) {
            System.out.println(array[i]);

        }
    }
}
