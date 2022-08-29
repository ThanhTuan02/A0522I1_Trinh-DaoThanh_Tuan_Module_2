package s05_Access.baitap.Access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập radius");
        double radius = sc.nextDouble();
        Circle newCircle = new Circle(radius);
        System.out.println(("Area = " + newCircle.getArea()));
    }
}
