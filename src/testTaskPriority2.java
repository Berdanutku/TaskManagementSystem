import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskPriority2 extends TestCase {
    // Checks task priority is correct.
    Priority expected;
    Priority negativeExpected;
    Priority actual;
    @BeforeEach
    public void setUp() {

    }



    @Test
    public void testTaskPriority2Positive() {
        Task task=new Task();
        task.setPriority("2");
        actual=task.getPriority();
        expected =Priority.MODERATE;
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskPriority2Negative() {
        Task task=new Task();
        task.setPriority("2");
        actual=task.getPriority();
        expected = Priority.HIGH;
        assertNotEquals(expected,actual);
    }
}