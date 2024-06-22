import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;



public class testGetEditors {
    // Test Editor's added correctly in Task class
    private Task task;
    String expected;
    String actual;
    String editor1;
    String editor2;

    @Before
    @BeforeEach
    public void setUp() {
        task = new Task();
        editor1 = "Alper";
        editor2 = "Kubra";

    }
    @org.junit.Test
    @Test
    public void getEditorsPositiveTest() {

        task.getEditorsList().add(new User(editor1, "1234"));
        task.getEditorsList().add(new User(editor2, "5678"));


        expected = editor1 + " - Editor\n" + editor2 + " - Editor\n";
        actual = task.getEditors();


        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    @Test
    public void getEditorsNegativeTest() {
        task.getEditorsList().add(new User(editor1, "1234"));
        task.getEditorsList().add(new User(editor2, "5678"));

        expected = "";
        actual = task.getEditors();


        assertNotEquals(expected, actual);
    }
}
