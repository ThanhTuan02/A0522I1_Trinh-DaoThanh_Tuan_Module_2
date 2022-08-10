package s02_Loop.baitap;

public class hien_thi_so_NT_nho_hon_100 {
    public static void main(String[] args) {
        int count = 0, n =2;
        while (count < 25) {
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
