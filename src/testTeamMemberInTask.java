import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testTeamMemberInTask {
    // test the team member in the task or not.
    // if it is, it should return true if not, it should return false
    MyDatabase database;
    boolean expected;
    boolean negativeExpected;
    boolean actual;
    User userInput;
    int idInput;

    @Before
    @BeforeEach
    public void setUp() throws SQLException {
        database = new MyDatabase();
        database.connect();
        expected = true;
        negativeExpected = false;
        userInput = new User("test","1234"); // creating test User
        idInput = 100; // test Id
    }

    @After
    @AfterEach
    public void tearDown() throws SQLException {
        database.deleteAssignment(userInput.getName(), idInput); // after finishes it deletes test assignment
        userInput = null;
        idInput = 0;
        expected = false;
        negativeExpected = false;
        actual = false;
    }
    @org.junit.Test
    @Test
    public void isTeamMemberInTaskPositive() throws SQLException {
        database.setAssignment(userInput, idInput); // adding test input in database
        actual = database.IsTeamMemberInTask(100,"test"); // if given inputs is in database it returns true.
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void isTeamMemberInTaskNegative() throws SQLException {
        database.setAssignment(userInput, idInput); // adding test input in database
        actual = database.IsTeamMemberInTask(100,"test"); // if given inputs is not in database it returns false.
        assertNotEquals(negativeExpected,actual);
    }
}