import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

enum Priority{ // Enum data type for Priority of Task
    HIGH,
    MODERATE,
    LOW,
}
enum Phase{ // Enum data type for Priority of Task
    DONE,
    DOING,
    TODO,
}
public class Task {
    // Task object fields.
    private String taskName;
    private int taskId;
    private String description;
    private Priority priority;
    private User owner;
    private LocalDate start;
    private LocalDate end;
    private ArrayList<User> assignedUserList;
    private ArrayList<User> editorsList;
    private boolean completed;
    private Phase phase;


    // constructor
    public Task(String taskName, int taskId, String description, User owner, LocalDate start, LocalDate end) {
        this.taskName = taskName;
        this.taskId = taskId;
        this.description = description;
        this.owner = owner;
        this.start = start;
        this.end = end;
        this.setPriority("3");
        this.setPhase("3");
        this.assignedUserList = new ArrayList<>();
        this.editorsList = new ArrayList<>();
        this.completed=false;
    }

    public Task() {
        this.assignedUserList = new ArrayList<>();
        this.editorsList = new ArrayList<>();
        this.completed=false;
    } // default constructor

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public LocalDate getStart() {
        return start;
    }

    public ArrayList<User> getAssignedUserList() {
        return assignedUserList;
    }
    public void setAssignedUserList(ArrayList<User> assignedUserList) {
        this.assignedUserList = assignedUserList;
    }

    public ArrayList<User> getEditorsList() {
        return editorsList;
    }

    public void setEditorsList(ArrayList<User> editorsList) {
        this.editorsList = editorsList;
    }

    public boolean isUserAssignee(User user){ // checks whether user is assignee or not. if not returns false
        return assignedUserList.contains(user);
    }
    public boolean isUserEditor(User user){ // checks whether user is Editor or not. if not returns false
        return editorsList.contains(user);
    }
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setStart(String start) { // Starting date of the project
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // check the format is ok
        LocalDate startDate = LocalDate.parse(start, formatter);
        if (startDate.isAfter(LocalDate.now())||startDate.isEqual(LocalDate.now())) { // if date is before the current date it sets to current date.
            this.start = startDate;
        } else {
            System.out.println("Invalid input!\nStart date must be after the current date.\nStart date is set as current date.");
            this.start=LocalDate.now();
        }
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(String end) {// Due Date of the project
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endDate = LocalDate.parse(end, formatter);
        if (endDate.isAfter(this.start)) { // if date is before the starting date of task it sets to current date.
            this.end = endDate;
        } else {
            System.out.println("Invalid input!\nEnd date cannot be before the start date.\nEnd date is set as current date.");
            this.end=LocalDate.now();
        }
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        // set string value to enum
        switch (priority){
            case "1":
                this.priority = Priority.HIGH;
                break;
            case "2":
                this.priority = Priority.MODERATE;
                break;
            default:
                this.priority = Priority.LOW;
        }
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        // set string value to enum
        switch (phase){
            case "1":
                this.phase = Phase.DONE;
                // if phase is done then task set the completed variable to true
                setCompleted(true);
                break;
            case "2":
                this.phase = Phase.DOING;
                break;
            default:
                this.phase = Phase.TODO;
        }
    }

    public String getEditors(){
        String s = "";
        for (User editor : editorsList ){
            s+=editor.getName() + " - Editor" +'\n';
        }
        return s;
    }
    public String getAssignees(){
        String s = "";
        for (User assignees : assignedUserList ){
            s+=assignees.getName() + " - Asignee" +'\n';
        }
        return s;
    }
    public long getDuration() {
        return java.time.temporal.ChronoUnit.DAYS.between(start, end);
    }
    @Override
    public String toString() {
        return "TaskName: " + taskName + '\n' +
                "TaskId: " + taskId + '\n' +
                "Description: " + description + '\n' +
                "Priority: " + priority + '\n' +
                "Phase: " + phase + '\n' +
                "Owner: " + owner + '\n' +
                "Start Date: " + start + '\n' +
                "End Date: " + end + '\n';
    }
}
