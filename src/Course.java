import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Double> categoryWeights;
    private ArrayList<String> categories;
    private ArrayList<Assignment> assignments;
    private ArrayList<String> letterGrades;
    private ArrayList<Double> cutoffs;

    public Course(String name) {
        this.name = name;
        this.categoryWeights = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.letterGrades = new ArrayList<>();
        this.cutoffs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCutoff(String letterGrade, double cutoff) {
        if (cutoff >= 0.0) {
            this.cutoffs.add(cutoff);
            this.letterGrades.add(letterGrade);

        }

    }
}
