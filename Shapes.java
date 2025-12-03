abstract class Shapes {
    private String name;

    public Shapes(String name) {
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
        // Default implementation (can be overridden by subclasses)
        System.out.println("The area of " + name + " is: " + area());

    }

    public void calculatePerimeter() {
        // Default implementation (can be overridden by subclasses)
        System.out.println("The perimeter of " + name + " is: " + perimeter());
    }

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());

    }


    

}