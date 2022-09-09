package s07_interface.thuchanh.Comparable;

public class ComparableCircle extends Circle
implements Comparable<ComparableCircle> {

public ComparableCircle(double v) {
        super(3.6);
}


public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
        }

@Override
public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
        }
}
