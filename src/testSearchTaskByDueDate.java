import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class testSearchTaskByDueDate extends TestCase {
    //In searchTask method, it performs search by given due date. if it finds return intended the task.
    String expected;
    String negativeExpected;
    String actual;
    User user=new User("User","1234");
    Task task1=new Task("Task1",1,"Task1",user, LocalDate.parse("2024-10-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.parse("2024-10-15", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    Task task2=new Task("Task2",2,"Task2",user, LocalDate.parse("2024-12-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.parse("2024-12-15", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    @BeforeEach
    public void setUp() {
        Main.taskList.add(task1);
        Main.taskList.add(task2);
        expected="2024-10-15";
        negativeExpected="2024-12-15";
    }

    @AfterEach
    public void tearDown() {
        expected="";
        negativeExpected="";
    }

    @Test
    public void testSearchTaskByDueDatePositive() {
        String input="2024-10-15";
        for (Task task:Main.taskList){
            if (task.getEnd().toString().equals(input)){
                actual=task.getEnd().toString();
            }
        }
        assertEquals(expected,actual);
    }
    @Test
    public void testSearchTaskByDueDateNegative() {
        String input="2024-10-15";
        for (Task task:Main.taskList){
            if (task.getEnd().toString().equals(input)){
                actual=task.getEnd().toString();
            }
        }
        assertNotEquals(negativeExpected,actual);
    }
}