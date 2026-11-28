import java.util.ArrayList;

public class GradeTracker {
    public static void main() {

        IO.println("Hello, student!");

        String command = "0";
        ArrayList<Course> courses = new ArrayList<>();

        while (!(command.equals("5"))) {
            IO.println("Menu:");
            IO.println("1. Add course");
            IO.println("2. Add assignment");
            IO.println("3. Calculate current grade");
            IO.println("4. What do I need to achieve target grade?");
            IO.println("5. Quit");
            command = IO.readln("Select a number: ");

            if (command.equals("1")) {
                String courseName = IO.readln("Enter course name: ");
                Course course = new Course(courseName);

                // Uses a while loop because total weight needs to be 100;

                while ((Math.abs(100 - course.getTotal())) > 0.00001) {
                    String categoryName = IO.readln("Enter category name: ");
                    double categoryWeight = Double.parseDouble(IO.readln("Enter category weight: "));
                    boolean add = course.addCategory(categoryName, categoryWeight);

                    if (!add) {
                        IO.println("Invalid weight.");
                    } else {
                        IO.println("The category has been added.");
                    }
                }

                courses.add(course);
                IO.println("The course has been added");

            }
            if (command.equals("2")) {}
            if (command.equals("3")) {}
            if (command.equals("4")) {}

        }
    }
}
