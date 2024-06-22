import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testSetPhase {
    // Test if task phase is set to DONE changes the isCompleted part to true.
    Task testTask;
    boolean expected;
    boolean actual;

    @Before
    @BeforeEach
    public void setUp() {
        testTask = new Task();
        expected = false;
        actual = false;
    }

    @After
    @AfterEach
    public void tearDown() {
        testTask = null;
        expected = false;
        actual = false;
    }
    @org.junit.Test
    @Test
    public void setPhasePositive() {
        testTask.setPhase("1");
        expected = true;
        actual = testTask.isCompleted();
        Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    @Test
    public void setPhaseNegative() {
        testTask.setPhase("2");
        expected = true;
        actual = testTask.isCompleted();
        assertNotEquals(actual,expected);
    }
}