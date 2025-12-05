import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testArea() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.area());
    }

    @Test
    void testPerimeter() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(18, r.perimeter());
    }

    @Test
    void testDisplayInfo() {
        Rectangle r = new Rectangle(4, 5);
        r.displayInfo(); // ensures no exceptions
    }
}
