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

    // No upper limit to account for extra credit

    public boolean addCutoff(String letterGrade, double cutoff) {
        if (cutoff >= 0.0) {
            this.cutoffs.add(cutoff);
            this.letterGrades.add(letterGrade);
            return true;
        } else {
            return false;
        }
    }

    // Makes a method that returns the total so that the user can break out of the loop in main

    public double getTotal() {
        double total = 0.0;
        for (double w : categoryWeights) {
            total += w;
        }
        return total;
    }


    // Makes a boolean so user knows when cannot add a weight

    public boolean addCategory(String category, double weight) {
        if (weight > 0.0 && weight + getTotal() <= 100.0) {
            this.categoryWeights.add(weight);
            this.categories.add(category);
            return true;
        } else {
            return false;
        }
    }
}
