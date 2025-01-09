package ps002.PS003;

class Bowlers {
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public Bowlers() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowlers(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are zero.");
            return;
        }
        double bowling_avg = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowling_avg);
    }

    public void showStatistics() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    // Method to compute and print the strike rate
    public void computeStrikeRate() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        if (balls_bowled == 0) {
            System.out.println("Strike rate cannot be calculated as balls bowled are zero.");
            return;
        }
        double strike_rate = (double) runs_conceded / balls_bowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strike_rate);
    }

    private boolean hasInvalidValues() {
        return wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0
                || (matches == 0 && (runs_conceded > 0 || balls_bowled > 0));
    }
}

public class Testing {
    public static void main(String[] args) {
        // Creating a Bowler object with provided values
        Bowlers bowler = new Bowlers("Sachin", 10, 5, 750, 463);

        // Calling methods of Bowler class
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}
