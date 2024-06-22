import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testSendReminder {
    // Test reminder send in a specific class correctly if so it prints message
    String expected;
    String actual;

    @Before
    @BeforeEach
    public void setUp() {
    }


    @org.junit.Test
    @Test
    public void sendReminderPositiveTest() {
        Task task = new Task("test",1,"task1", new User(), LocalDate.parse("2024-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.parse("2024-01-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        expected = "Reminder has sent";
        actual = Reminder.sendReminder(task);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void sendReminderNegativeTest() {
        Task task = new Task("test",1,"task1", new User(), LocalDate.parse("2024-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.parse("2024-01-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        expected = "miss";
        actual = Reminder.sendReminder(task);
        assertNotEquals(expected, actual);
    }
}