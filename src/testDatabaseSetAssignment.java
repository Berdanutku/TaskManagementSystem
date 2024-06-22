import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testDatabaseSetAssignment {
    // It test setAssignment function. Check does database stores assignments proper way.
    //  To check we call function getAllAssignment to return all assignments store in database.
    MyDatabase database;
    User userInput;
    String expected;
    String negativeExpected;
    String actual;
    HashMap<String,String> assignedMap;
    int Id;

    @Before
    @BeforeEach
    public void setUp() throws SQLException {
        assignedMap = new HashMap<>();
        database = new MyDatabase();
        database.connect();
        userInput = new User("test","1234"); // creating test User
        Id = 100; // test Id
        expected = String.valueOf(100);
        negativeExpected = String.valueOf(15);
    }

    @After
    @AfterEach
    public void tearDown() throws SQLException {
        database.deleteAssignment(userInput.getName(),Id); // after finishes it deletes test assignment
        database = null;
        userInput = null;
        Id = 0;
    }
    @org.junit.Test
    @Test
    public void setAssignmentPositive() throws SQLException {
        database.setAssignment(userInput,Id); // It stores (userName,TaskId) pairs
        assignedMap = database.getAllAssignments(); // get all assignments as a hashmap.
        actual = assignedMap.get("test"); // if there is a "test" key that should contains proper Id.
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void setAssignmentNegative() throws SQLException {
        database.setAssignment(userInput,Id); // It stores (userName,TaskId) pairs
        assignedMap = database.getAllAssignments(); // get all assignments as a hashmap.
        actual = assignedMap.get("test"); // if there is a "test" key that should contains proper Id.
        assertNotEquals(negativeExpected,actual); // Not another Id
    }
}