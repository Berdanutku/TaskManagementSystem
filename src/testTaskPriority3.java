import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskPriority3 extends TestCase {
    // Checks task priority is correct.
    Priority expected;
    Priority negativeExpected;
    Priority actual;
    @BeforeEach
    public void setUp() {

    }



    @Test
    public void testTaskPriority3Positive() {
        Task task=new Task();
        task.setPriority("3");
        actual=task.getPriority();
        expected =Priority.LOW;
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskPriority3Negative() {
        Task task=new Task();
        task.setPriority("3");
        actual=task.getPriority();
        expected = Priority.HIGH;
        assertNotEquals(expected,actual);
    }
}