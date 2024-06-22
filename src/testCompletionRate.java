import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testCompletionRate {
    //Test completion rate of the tasks are correct or not.
    double expected;
    double negativeExpected;
    double actual;
    @BeforeEach
    @Before
    public void setUp() throws SQLException {
        expected=11.11111111111111;
        negativeExpected=10.0;
        MyDatabase database=new MyDatabase();
        database.connect();
        database.getTasks(Main.taskList,Main.userList);
    }
    @AfterEach
    @After
    public void tearDown() {
        expected=0;
        negativeExpected=0;
        Main.taskList.clear();
        Main.userList.clear();
    }

    @org.junit.Test
    @Test
    public void testCompletionRatePositive() {
        long completedTasks = Main.taskList.stream().filter(Task::isCompleted).count();
        long totalTasks = Main.taskList.size();
        actual= ((double)completedTasks / totalTasks) * 100;
        Assert.assertEquals(expected, actual,0);
    }

    @org.junit.Test
    @Test
    public void testCompletionRateNegative() {
        long completedTasks = Main.taskList.stream().filter(Task::isCompleted).count();
        long totalTasks = Main.taskList.size();
        actual= ((double)completedTasks / totalTasks) * 100;
        assertNotEquals(negativeExpected,actual);
    }
}