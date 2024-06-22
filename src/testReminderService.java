import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testReminderService {
    // Test reminder service is started without any problem if so it prints message
    String expected;
    String actual;

    @Before
    @BeforeEach
    public void setUp() {
    }


    @org.junit.Test
    @Test
    public void startReminderServicePositiveTest() {

        expected = "Reminder service has started";
        actual = Reminder.startReminderService();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void startReminderServiceNegativeTest() {
        expected = "miss";
        actual = Reminder.startReminderService();
        assertNotEquals(expected, actual);
    }
}