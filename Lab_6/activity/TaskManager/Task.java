package Lab_6.activity.TaskManager;

class Task {
    String taskName;
    Task next;

    public Task(String taskName) {
        this.taskName = taskName;
        this.next = null;
    }
}
