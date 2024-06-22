import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Report {
    // Make necessary calculations for test completion report.
    public static void generateTaskCompletionReport(List<Task> tasks) {
        long completedTasks = tasks.stream().filter(Task::isCompleted).count();
        long totalTasks = tasks.size();
        double completionRate = ((double) completedTasks / totalTasks) * 100;

        System.out.println("Task Completion Report:");
        System.out.println("Total Tasks: " + totalTasks);
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Completion Rate: " + String.format("%.2f", completionRate) + "%");
    }
    // Displays the information about task reports.
    public static void generateProjectTimelineReport(List<Task> tasks) {
        System.out.println("Project Timeline Report:");
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTaskName());
            System.out.println("Start Date: " + task.getStart());
            System.out.println("End Date: " + task.getEnd());
            System.out.println("Duration: " + task.getDuration() + " days");
            System.out.println("Phase: " + task.getPhase());
            System.out.println("Status: " + (task.isCompleted() ? "Completed" : "In Progress"));
            System.out.println("----------------------------");
        }
    }
    // Generates all reports for tasks.
    public static void generateAllReports(List<Task> tasks) {
        generateTaskCompletionReport(tasks);
        System.out.println();
        generateProjectTimelineReport(tasks);
    }
}
