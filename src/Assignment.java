// Create class Assignments with private fields so they cannot be changed;
// its own class so can create one in main
public class Assignment {
    private String name;
    private String category;
    private double score;
    private double worth;

    public Assignment(String name, String category, double score, double worth) {
        this.name = name;
        this.category = category;
        this.score = score;
        this.worth = worth;
    }


    public double getWorth() {
        return worth;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

}


