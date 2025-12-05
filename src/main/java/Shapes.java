import java.util.logging.Logger;

abstract class Shapes {
    private static final Logger LOGGER = Logger.getLogger(Shapes.class.getName());
    private String name;

    protected Shapes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    public void calculateArea() {
        LOGGER.info(() -> "The area of " + name + " is: " + area());
    }

    public void calculatePerimeter() {
        LOGGER.info(() -> "The perimeter of " + name + " is: " + perimeter());
    }

    public void displayInfo() {
        LOGGER.info(() -> "Shape: " + name);
        LOGGER.info(() -> "Area: " + area());
        LOGGER.info(() -> "Perimeter: " + perimeter());
    }
}
