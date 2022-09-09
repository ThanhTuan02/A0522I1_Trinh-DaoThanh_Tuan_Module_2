package s07_interface.baitap.Resizeable.test;

import javafx.scene.shape.Circle;
import s07_interface.baitap.Resizeable.shape.Shape;

public class test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new  Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Shape(x, "melinda", true);
        shapes[2] = new Shape(x, "infinity ", true);
        for (Shape a : shapes){
            System.out.println(a);
        }
        for (Shape a : shapes){
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
