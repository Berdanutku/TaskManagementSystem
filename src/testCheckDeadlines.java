import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testCheckDeadlines {
    // Check all tasks deadlines and then print checked message
    String expected;
    String actual;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }


    @org.junit.Test
    public void checkDeadlinesPositiveTest() {

        expected = "Deadlines has been checked";
        actual = Reminder.checkDeadlines();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void checkDeadlinesNegativeTest() {
        expected = "miss";
        actual = Reminder.checkDeadlines();
        assertNotEquals(expected, actual);
    }
}