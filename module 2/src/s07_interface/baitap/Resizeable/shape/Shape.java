package s07_interface.baitap.Resizeable.shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(int x, String infinity_, boolean b) {

    }
    public Shape() {
        this.color = color;
        this.filled = filled;
    }

    public static void printShape(Shape[] shapes) {
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
        return "A shape with color of" + getColor() + "and" + (isFilled() ? "filled" : "not filled");
    }

    public void resize(double v) {
    }
}
