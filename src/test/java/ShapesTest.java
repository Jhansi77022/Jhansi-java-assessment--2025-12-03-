import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapesTest {

    class DummyShape extends Shapes {
        public DummyShape() {
            super("Dummy");
        }

        @Override
        public double area() {
            return 10;
        }

        @Override
        public double perimeter() {
            return 20;
        }
    }

    @Test
    void testCalculateArea() {
        Shapes s = new DummyShape();
        s.calculateArea(); // no exception
    }

    @Test
    void testCalculatePerimeter() {
        Shapes s = new DummyShape();
        s.calculatePerimeter(); // no exception
    }

    @Test
    void testDisplayInfo() {
        Shapes s = new DummyShape();
        s.displayInfo(); // no exception
    }

    @Test
    void testGetterSetter() {
        Shapes s = new DummyShape();
        s.setName("TestName");
        assertEquals("TestName", s.getName());
    }
}
