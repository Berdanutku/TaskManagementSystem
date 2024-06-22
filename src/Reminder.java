import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
    // Reminder class fields
    private static final long PERIOD = 24 * 60 * 60 * 1000; // 24 hours in milliseconds
    // sets up a timer to check deadlines every 24 hours
    public static String startReminderService() {
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                checkDeadlines();
            }
        }, 0, PERIOD);
        return "Reminder service has started";
    }
    // Checks end date is tomorrow or not.
    public static String checkDeadlines() {
        LocalDate today = LocalDate.now();
        for (Task task : Main.taskList) {
            LocalDate endDate = task.getEnd();
            if (endDate.isEqual(today.plusDays(1))) {
                sendReminder(task);
            }
        }
        return "Deadlines has been checked";
    }
    // if end date is tomorrow it sends notification to user.
    public static String sendReminder(Task task) {
        System.out.println("Reminder: Task '" + task.getTaskName() + "' is due tomorrow!");
        return "Reminder has sent";
    }

}
