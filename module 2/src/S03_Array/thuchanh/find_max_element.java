package S03_Array.thuchanh;

import java.util.Scanner;

public class find_max_element {
    public static void main(String[] args) {
        //khai báo biến, nhập và kiểm tra size mảng
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        // In ra danh sách tài sản đã nhập
        System.out.println("Property list: ");
        for (int j = 0;i< array.length;j++) {
            System.out.println(array[j] + "\t");
        }
        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length;j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
