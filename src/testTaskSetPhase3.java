import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testTaskSetPhase3 {
    // Test Task Phase is TO-DO or not when user enters a correct number.
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
    public void phase3PositiveTest() {
        task.setPhase("3");
        expected = Phase.TODO;
        actual = task.getPhase();

        Assert.assertEquals(expected, actual);

    }
    @org.junit.Test
    @Test
    public void phase3NegativeTest() {
        task.setPhase("3");
        expected = Phase.DONE;
        actual = task.getPhase();

        assertNotEquals(expected, actual);

    }


}