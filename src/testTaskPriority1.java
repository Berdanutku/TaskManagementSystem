import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskPriority1 extends TestCase {
    // Checks task priority is correct.
    Priority expected;
    Priority negativeExpected;
    Priority actual;
    @BeforeEach
    public void setUp() {

    }



    @Test
    public void testTaskPriority1Positive() {
        Task task=new Task();
        task.setPriority("1");
        actual=task.getPriority();
        expected =Priority.HIGH;
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskPriority1Negative() {
        Task task=new Task();
        task.setPriority("1");
        actual=task.getPriority();
        expected = Priority.MODERATE;
        assertNotEquals(expected,actual);
    }
}