import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testDatabaseConnection {
    // Test database connection. if database connected successfully prints a corresponding message
    MyDatabase myDatabase = new MyDatabase();


    String expected;
    String actual;

    @Before
    @BeforeEach
    public void setUp() {
    }



    @org.junit.Test
    public void databaseConnectionPositiveTest() throws SQLException {

        expected = "Connected to database";
        actual = myDatabase.connect();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void databaseConnectionNegativeTest() throws SQLException {

        expected = "miss";
        actual = myDatabase.connect();
        assertNotEquals(expected, actual);
    }
}