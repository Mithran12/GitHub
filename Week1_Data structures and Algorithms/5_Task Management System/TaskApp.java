public class TaskApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("📝 All Tasks:");
        manager.showAllTasks();

        System.out.println("\n🔍 Searching for Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? "Found: " + found : "Not found");

        System.out.println("\n❌ Deleting Task ID 1...");
        boolean deleted = manager.deleteTask(1);
        System.out.println(deleted ? "Deleted Successfully." : "Not Found");

        System.out.println("\n📋 Remaining Tasks:");
        manager.showAllTasks();
    }
}
