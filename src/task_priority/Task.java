package task_priority;

public class Task {
    private String description;
    private TaskPriority priority;

    public Task(TaskPriority priority, String description) {
        this.description = description;
        this.priority = priority;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\t-" + description;
    }
}
