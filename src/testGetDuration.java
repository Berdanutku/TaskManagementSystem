import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class testGetDuration extends TestCase {
    // It test duration of start and end is correct or not
    private Task task;
    long expected;
    long actual;


    @BeforeEach
    public void setUp() {
        User user= new User("user","1234");
        // Initialize Task with start and end dates
        task = new Task("Task1",1,"task1", user,LocalDate.parse("2024-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.parse("2024-01-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        

    }


    @Test
    public void testGetDurationPositive() {
        expected = 9;
        actual = task.getDuration();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDurationNegative() {
        expected = 1;
        actual = Math.toIntExact(task.getDuration());

        assertNotEquals(expected, actual);
    }
}
