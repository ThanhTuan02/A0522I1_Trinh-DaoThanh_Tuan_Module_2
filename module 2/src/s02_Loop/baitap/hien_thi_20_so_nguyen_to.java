package s02_Loop.baitap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        int count = 0, n =2;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i< n;i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
