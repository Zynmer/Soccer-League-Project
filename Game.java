

public class Game {

    // Properties: Team Names, Scores, Temp, and Id #
    private static int nextId = 1;

    private String Team1;
    private String Team2;
    private int TeamScore1;
    private int TeamScore2;
    private double DayTemp;
    private int Id;

    // Constructer for Game class
    public Game(String Team1, String Team2, double Daytemp) {

        this.Id = nextId++;
        this.Team1 = Team1;
        this.Team2 = Team2;
        this.DayTemp = Daytemp;

    }

    // Getters for Game Class
    public void setTeamScores( int s1, int s2) {

        TeamScore1 = s1;
        TeamScore2 = s2;

    }

    public String getSummary() {

        return "Game " + Id + ": " + Team1 + " " + TeamScore1 + 
                " - " + TeamScore2 + " " + Team2 + 
                " | Temp; " + DayTemp;

    }

    public double getDayTemp() {

        return DayTemp;

    }
}
