import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Choose a shape (1-2): ");
        int choice = scanner.nextInt();

        Shapes shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = scanner.nextDouble();
                shape = new Circle(r);
                break;
            case 2:
                System.out.print("Enter length: ");
                double l = scanner.nextDouble();
                System.out.print("Enter width: ");
                double w = scanner.nextDouble();
                shape = new Rectangle(l, w);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        shape.displayInfo();
        scanner.close();

    }
}