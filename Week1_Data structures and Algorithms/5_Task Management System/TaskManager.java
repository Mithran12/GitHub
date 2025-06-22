public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Task searchTask(int id) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.taskId == id) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean deleteTask(int id) {
        if (head == null) return false;

        if (head.task.taskId == id) {
            head = head.next;
            return true;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.taskId == id) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void showAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}
