package s06_ke_thua.baitap.circle_cylinder.Circle;

public class cylinder extends circle{
    private double height = 0;

    public cylinder(){
    }
    public cylinder(double radius,double height) {
        super(radius);
        this.height=height;
    }
    public cylinder(String color, String fillcolor, double radius, double height){
        super(color, radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public cylinder(String color, double radius, double height){
        super(color,radius);
    }
    public double getVolum() {
     return super.getArea()* this.height;
    }

    @Override
    public double getArea() {
        return super.getArea()* 2+ super.getPerimer()* this.height;
    }

    @Override
    public String toString() {
        return super.toString()+
                "+ chiều cao: " + this.getHeight() + "\n";
    }
}
