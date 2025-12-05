import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.*;

public class MainTest {

    @Test
    void testCircleFlow() {
        String input = "1\n5\n";   
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    void testRectangleFlow() {
        String input = "2\n4\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    void testInvalidChoice() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
