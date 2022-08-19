package s04_class_and_object.baitap.phuongtrinhbac2;


import java.util.Scanner;
public class phuong_trinh_bac2 {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("nhập a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if (qe.getDiscrimiamant()<0) {
            System.out.println("Phương trình có nghiệm nguyên: " + qe.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm ");
            System.out.println("Denta là : " + qe.getDiscrimiamant());
            System.out.println("Nghiệm 1: " + qe.getRoot1());
            System.out.println("Nghiệm 2: " + qe.getRoot2());
        }
    }
}

