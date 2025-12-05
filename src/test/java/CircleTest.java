import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testArea() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.area(), 0.0001);
    }

    @Test
    void testPerimeter() {
        Circle c = new Circle(5);
        assertEquals(2 * Math.PI * 5, c.perimeter(), 0.0001);
    }

    @Test
    void testDisplayInfo() {
        Circle c = new Circle(3);
        c.displayInfo(); // just ensures no exceptions
    }
}
