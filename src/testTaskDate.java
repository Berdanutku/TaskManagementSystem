import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskDate extends TestCase {
    // Checks start date is correct.
    String expected;
    String negativeExpected;
    String actual;
    @BeforeEach
    public void setUp() {
        expected="2024-10-10";
        negativeExpected="2024-12-12";
    }

    @AfterEach
    public void tearDown() {
        expected="";
        negativeExpected="";
    }

    @Test
    public void testTaskDatePositive() {
        Task task=new Task();
        task.setStart("2024-10-10");
        actual=task.getStart().toString();
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskDateNegative() {
        Task task=new Task();
        task.setStart("2024-10-10");
        actual=task.getStart().toString();
        assertNotEquals(negativeExpected,actual);
    }
}