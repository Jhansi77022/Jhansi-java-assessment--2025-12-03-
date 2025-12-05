import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LOGGER.info("1. Circle");
        LOGGER.info("2. Rectangle");
        LOGGER.info("Choose a shape (1-2): ");

        int choice = scanner.nextInt();

        Shapes shape = null;

        switch (choice) {
            case 1:
                LOGGER.info("Enter radius: ");
                double r = scanner.nextDouble();
                shape = new Circle(r);
                break;

            case 2:
                LOGGER.info("Enter length: ");
                double l = scanner.nextDouble();

                LOGGER.info("Enter width: ");
                double w = scanner.nextDouble();

                shape = new Rectangle(l, w);
                break;

            default:
                LOGGER.warning("Invalid choice!");
                scanner.close();
                return;
        }

        shape.displayInfo();
        scanner.close();
    }
}
