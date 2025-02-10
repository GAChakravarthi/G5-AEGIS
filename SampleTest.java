import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testMessage() {
        String message = "Hello, CI/CD Pipeline!";
        assertEquals("Hello, CI/CD Pipeline!", message);
    }
}
