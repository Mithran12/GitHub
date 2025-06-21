public class MVCTest {
    public static void main(String[] args) {

        Student student = new Student("Arjun", "S101", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Arjun Mehta");
        controller.setStudentGrade("A+");

        System.out.println("\n--- Updated Student Record ---");
        controller.updateView();
    }
}
