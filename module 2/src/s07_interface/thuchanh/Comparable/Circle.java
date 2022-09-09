package s07_interface.thuchanh.Comparable;

public class Circle {
    private String color = "green";
    private boolean filled = true;
    private double radius = 1.0;

    public Circle(double v) {

    }


    public Circle(double radius, String color, boolean filled) {
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}
