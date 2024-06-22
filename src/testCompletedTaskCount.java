import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCompletedTaskCount extends TestCase {
    //Test number of completed tasks are correct or not.
    long expected;
    long negativeExpected;
    long actual;
    @BeforeEach
    public void setUp() {
        expected=0;
        negativeExpected=1;
    }

    @AfterEach
    public void tearDown() {
        expected=0;
        negativeExpected=0;
    }

    @Test
    public void testCompletedTaskCountPositive() {
        actual=Main.taskList.stream().filter(Task::isCompleted).count();
        assertEquals(expected,actual);
    }
    @Test
    public void testCompletedTaskCountNegative() {
        actual=Main.taskList.stream().filter(Task::isCompleted).count();
        assertNotEquals(negativeExpected,actual);
    }
}