import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testGetAssignees {
    // Test Assignees added correctly in Task class.
    private Task task;
    String expected;
    String actual;
    String assignee1;
    String assignee2;

    @Before
    @BeforeEach
    public void setUp() {
        task = new Task();
        assignee1 = "Alper";
        assignee2 = "Kubra";
    }

    @Test
    @org.junit.Test
    public void getAssigneesPositiveTest() {

        task.getAssignedUserList().add(new User(assignee1, "1234"));
        task.getAssignedUserList().add(new User(assignee2, "5678"));


        expected = assignee1 + " - Asignee\n" + assignee2 + " - Asignee\n";
        actual = task.getAssignees();


        Assert.assertEquals(expected, actual);
    }

    @Test
    @org.junit.Test
    public void getAssigneesNegativeTest() {

        task.getAssignedUserList().add(new User(assignee1, "1234"));
        task.getAssignedUserList().add(new User(assignee2, "5678"));


        expected = "";
        actual = task.getAssignees();


        assertNotEquals(expected, actual);
    }
}
