import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        testCheckDeadlines.class,
        testCompletedTaskCount.class,
        testCompletionRate.class,
        testDatabaseConnection.class,
        testDatabaseCreateTask.class,
        testDatabaseCreateUser.class,
        testDatabaseSetAssignment.class,
        testGetAssignees.class,
        testGetDuration.class,
        testGetEditors.class,
        testReminderService.class,
        testSearchTaskByDueDate.class,
        testSearchTaskById.class,
        testSearchTaskByName.class,
        testSearchTaskByOwner.class,
        testSendReminder.class,
        testSetPhase.class,
        testTaskDate.class,
        testTaskId.class,
        testTaskName.class,
        testTaskOwner.class,
        testTaskPriority1.class,
        testTaskPriority2.class,
        testTaskPriority3.class,
        testTaskSetPhase1.class,
        testTaskSetPhase2.class,
        testTaskSetPhase3.class,
        testTeamMemberInTask.class,
        testUserName.class,
        testUserPassword.class

})
public class AllTests {

}