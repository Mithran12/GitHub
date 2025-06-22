public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        // Add employees
        manager.addEmployee(new Employee(1, "Alice", "Developer", 80000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 120000));
        manager.addEmployee(new Employee(3, "Charlie", "Designer", 75000));

        System.out.println("\nAll Employees:");
        manager.showAllEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee emp = manager.searchById(2);
        System.out.println(emp != null ? emp : "Not found");

        System.out.println("\nDeleting employee with ID 1...");
        manager.deleteById(1);

        System.out.println("\nAll Employees After Deletion:");
        manager.showAllEmployees();
    }
}
