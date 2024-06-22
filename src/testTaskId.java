import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskId extends TestCase {
    // Checks id is correct.
    int expected;
    int negativeExpected;
    int actual;
    @BeforeEach
    public void setUp() {
        expected=1;
        negativeExpected=2;
    }

    @AfterEach
    public void tearDown() {
        expected=0;
        negativeExpected=0;
    }

    @Test
    public void testTaskIdPositive() {
        Task task=new Task();
        task.setTaskId(1);
        actual= task.getTaskId();
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskIdNegative() {
        Task task=new Task();
        task.setTaskId(1);
        actual= task.getTaskId();
        assertNotEquals(negativeExpected,actual);
    }
}