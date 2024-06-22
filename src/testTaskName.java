import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskName extends TestCase {
    // Checks task name is correct.
    String expected;
    String negativeExpected;
    String actual;
    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        expected="Task";
        negativeExpected="task";
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        expected="";
        negativeExpected="";
    }

    @Test
    public void testTaskNamePositive() {
        Task task=new Task();
        task.setTaskName("Task");
        actual= task.getTaskName();
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskNameNegative() {
        Task task=new Task();
        task.setTaskName("Task");
        actual= task.getTaskName();
        assertNotEquals(negativeExpected,actual);
    }
}