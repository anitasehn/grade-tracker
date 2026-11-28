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
                // Adds the categories to the course;

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

                // Adds the grades cutoffs;
                // Used a for loop with a predetermined number of letter grades; If cutoff is rejected, i--
                // disconsiders the try;
                int quant = Integer.parseInt(IO.readln("How many letter grades are there? "));
                for (int i = 0; i < quant; i++) {
                    String grade = IO.readln("Enter a letter grade: ");
                    double gradeCutoff = Double.parseDouble(IO.readln("Enter the letter grade cutoff: "));
                    if (course.addCutoff(grade, gradeCutoff)) {
                        IO.println("The grade has been added.");
                    } else {
                        IO.println("The cutoff is not valid.");
                        i--;
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
