import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testUserName extends TestCase {
    // Checks userName is correct.
    String expected;
    String negativeExpected;
    String actual;
    User user=new User("User","1234");
    @BeforeEach
    public void setUp() {
        Main.userList.add(user);
        expected="User";
        negativeExpected="user";
    }

    @AfterEach
    public void tearDown() {
        expected="";
        negativeExpected="";
    }

    @Test
    public void testUserNamePositive() {
        String input="User";
        for(User user:Main.userList){
            if(user.getName().equals(input)){
                actual= user.getName();
            }
        }
        assertEquals(expected,actual);
    }
    @Test
    public void testUserNameNegative() {
        String input="User";
        for(User user:Main.userList){
            if(user.getName().equals(input)){
                actual= user.getName();
            }
        }
        assertNotEquals(negativeExpected,actual);
    }
}