package src.main.java.org.example.challenges.collections.set;

import java.util.Objects;

public class Task implements Comparable<Task>{
    private String assignee;
    private String projectName;
    private String description;
    private Status status;
    private Priority priority;

    public Task(String assignee, String projectName, String description, Priority priority, Status status) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public Task(String assignee, String projectName, String description, Priority priority) {
        this(assignee, projectName, description, priority, assignee == null ? Status.IN_QUEUE : Status.ASSIGNED);
    }

    public Task(String projectName, String description, Priority priority) {
        this(null, projectName, description, priority);
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s%n".formatted(projectName, description, priority, assignee, status);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(getProjectName(), task.getProjectName()) && Objects.equals(getDescription(), task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjectName(), getDescription());
    }

    @Override
    public int compareTo(Task o) {
        int result = this.projectName.compareTo(o.projectName);
        if(result == 0) {
            result = this.description.compareTo(o.description);
        }
        return result;
    }
}
