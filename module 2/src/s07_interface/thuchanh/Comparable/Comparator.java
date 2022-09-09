package s07_interface.thuchanh.Comparable;

public interface Comparator<C> {
    String color = "green";
    boolean filled = true;



    public default String getColor() {
        return color;
    }

    public default void setColor(String color) {

    }

    public default boolean isFilled() {
        return filled;
    }

    public default void setFilled(boolean filled) {

    }
    @Override
    public String toString();

    int compare(Circle c1, Circle c2);
}
