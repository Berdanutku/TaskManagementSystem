import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class testUserPassword extends TestCase {
    //test password is correct
    // This test checks the password spelling.
    // The password should consist of only letters
    String expected;
    String negativeExpected;
    String actual;
    User user;

    @BeforeEach
    public void setUp() {
        expected = "5678";
        negativeExpected = "asdf";
        actual = "";
        user = new User();
    }

    @AfterEach
    public void tearDown() {
        expected = "";
        negativeExpected = "";
        actual = "";
        user = null;
    }

    @Test
    public void testUserPasswordPositive() {
        user.setPassword("5678");
        actual = user.getPassword();
        assertEquals(expected,actual);
    }
    @Test
    public void testUserPasswordNegative() {
        user.setPassword("asdf"); // if user gives word. set function prints a warning and set password as default letters(1234).
        actual = user.getPassword();
        assertNotEquals(negativeExpected,actual);
    }
}