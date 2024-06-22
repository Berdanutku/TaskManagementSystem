import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testTaskSetPhase1 {
    // Test Task Phase is DONE or not when user enters a correct number.
    private Task task;


    Phase expected;
    Phase actual;

    @Before
    @BeforeEach
    public void setUp() {
        task = new Task();
    }


    @org.junit.Test
    @Test
    public void phase1PositiveTest() {
        task.setPhase("1");
        expected = Phase.DONE;
        actual = task.getPhase();

        Assert.assertEquals(expected, actual);

    }
    @org.junit.Test
    @Test
    public void phase1NegativeTest() {
        task.setPhase("1");
        expected = Phase.TODO;
        actual = task.getPhase();

        assertNotEquals(expected, actual);

    }


}