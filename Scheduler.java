import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Scheduler {
    // Properties for Scheduler class
    private Team[] teams;
    private ArrayList<Game> games = new ArrayList<>();
    private int coldCount = 0;
    private double TempHotLimit = -999;
    // Random number generation
    Random rand = new Random();

    public Scheduler(Team[] teams) {

        this.teams = teams;

    }
    // Logic for consecuative cold days that end the season
    public boolean Temp(double temp) {

        if (temp > TempHotLimit) TempHotLimit = temp;

        if (temp <= 0) {

            coldCount++;

            if (coldCount >= 3) return false;

            return true;

        }

        coldCount = 0;

        ArrayList<Team> pool = new ArrayList<>(Arrays.asList(teams));
        Collections.shuffle(pool);

        playGame(pool.get(0), pool.get(1), temp);
        playGame(pool.get(2), pool.get(3), temp);

        return true;

    }

    // Game Logic: Logic for game simulation
    private void playGame(Team a, Team b, double temp) {

        Game g = new Game(a.getTeamName(), b.getTeamName(), temp);

        int maxGoals = (int)(1 + temp / 10);

        int scoreA = rand.nextInt(maxGoals + 1);
        int scoreB = rand.nextInt(maxGoals + 1);

        g.setTeamScores(scoreA, scoreB);
        games.add(g);

        a.addGoalsTotal(scoreA);
        a.addAllowedGoalsTotal(scoreB);

        b.addGoalsTotal(scoreB);
        b.addAllowedGoalsTotal(scoreA);

        if (scoreA > scoreB) {

            a.addWinTotal();
            b.addLossTotal();

        }
        else if (scoreB > scoreA) {

            b.addWinTotal();
            b.addLossTotal();

        }
        else {

            a.addTieTotal();
            b.addTieTotal();

        }
    }

    // String Return for JOptionPane: This is needed to allow everying to stay in JOptionPane
    public String getTeamsSummary() {

        String result = "";

        for (Team t : teams) {

            result += t.toString() + "\n";

        }

        return result;

    }

    public String getGamesSummary() {

        String result = "";

        for (Game g : games) {

            result += g.getSummary() + "\n";

        }

        return result;

    }

    
    

}
