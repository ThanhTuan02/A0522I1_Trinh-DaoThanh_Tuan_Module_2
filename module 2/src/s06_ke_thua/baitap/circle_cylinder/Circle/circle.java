package s06_ke_thua.baitap.circle_cylinder.Circle;

public class circle {

    private double radius = 1.0;
    private String color = "black";
    private String fillcolor = "red";


    public circle(String color, double radius) {

    }

    public circle() {
    }

    public circle (String color, String fillcolor) {
        this.color=color;
        this.fillcolor=fillcolor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFillcolor() {
        return fillcolor;
    }

    public void setFillcolor(String fillcolor) {
        this.fillcolor = fillcolor;
    }

    public circle(double radius) {
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimer() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of "  + super.toString();
    }
}
