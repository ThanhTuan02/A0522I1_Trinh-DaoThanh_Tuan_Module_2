package S03_Array.baitap;

public class gop_mang {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={6,7,8,9,10};
        int[] arr3= new int[arr1.length + arr2.length];
        for (int i =0;i < arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length;j++ ) {
            arr3[j] = arr2[j-arr1.length];
        }
        System.out.println("Mảng thứ nhất");
        for (int i = 0;i < arr1.length;i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nMảng thứ hai");
        for (int i = 0;i < arr2.length;i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println("\nMảng gôp");
        for (int i = 0; i< arr3.length;i++) {
            System.out.print(arr3[i] + ", ");
        }
    }
}
