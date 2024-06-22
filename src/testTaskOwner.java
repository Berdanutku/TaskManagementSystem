import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testTaskOwner extends TestCase {
    // Checks task owner name is correct.
    String expected;
    String negativeExpected;
    String actual;
    @BeforeEach
    public void setUp() {
        expected="User";
        negativeExpected="user";
    }

    @AfterEach
    public void tearDown() {
        expected="";
        negativeExpected="";
    }

    @Test
    public void testTaskOwnerPositive() {
        User user=new User("User","1234");
        Task task=new Task();
        task.setOwner(user);
        actual=task.getOwner().getName();
        assertEquals(expected,actual);
    }
    @Test
    public void testTaskOwnerNegative() {
        User user=new User("User","1234");
        Task task=new Task();
        task.setOwner(user);
        actual=task.getOwner().getName();
        assertNotEquals(negativeExpected,actual);
    }
}