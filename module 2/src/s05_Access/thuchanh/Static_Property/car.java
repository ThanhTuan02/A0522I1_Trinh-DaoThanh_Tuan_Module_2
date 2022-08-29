package s05_Access.thuchanh.Static_Property;

public class car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public car (String name, String engine) {
        this.name = name;
        this.engine = engine;

        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        car.numberOfCars = numberOfCars;
    }
}
