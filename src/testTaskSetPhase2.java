import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testTaskSetPhase2 {
    // Test Task Phase is DOING or not when user enters a correct number.
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
    public void phase2PositiveTest() {
        task.setPhase("2");
        expected = Phase.DOING;
        actual = task.getPhase();

        Assert.assertEquals(expected, actual);

    }
    @org.junit.Test
    @Test
    public void phase2NegativeTest() {
        task.setPhase("2");
        expected = Phase.TODO;
        actual = task.getPhase();

        assertNotEquals(expected, actual);

    }


}