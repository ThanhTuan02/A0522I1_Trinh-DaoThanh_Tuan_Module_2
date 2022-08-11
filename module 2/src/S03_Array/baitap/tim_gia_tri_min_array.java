package S03_Array.baitap;

import java.util.Scanner;

public class tim_gia_tri_min_array {
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
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0;i< array.length;j++) {
            System.out.println(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length;j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
}
