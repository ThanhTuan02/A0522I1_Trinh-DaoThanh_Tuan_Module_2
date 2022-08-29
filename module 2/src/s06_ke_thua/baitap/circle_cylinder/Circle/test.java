package s06_ke_thua.baitap.circle_cylinder.Circle;

public class test {
    public static void main(String[] args) {
        circle circle = new circle(15);
        System.out.println("hình tròn");
        System.out.println(circle.toString());
        System.out.println("+ diện tích: "+ circle.getArea());
        System.out.println("+ chu vi: "+ circle.getPerimer());

        cylinder cylinder = new cylinder(15,20);
        System.out.println("hình trụ");
        System.out.println(cylinder.toString());
        System.out.println("+ diện tích xung quanh: "+ cylinder.getArea());
        System.out.println("+ thể tích: " + cylinder.getVolum());
    }
}
