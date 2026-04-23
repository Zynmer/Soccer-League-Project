
class Team {
    
    // Properties for Team class
    private String TeamName;
    private int WinTotal;
    private int LossTotal;
    private int GoalsTotal;
    private int TieTotal;
    private int AllowedGoalsTotal;

    public Team(String TeamName) {

        this.TeamName = TeamName;

    }

    // Allows update to properties for Team Class

    public void addWinTotal() {

        WinTotal++;

    }

    public void addLossTotal() {

        LossTotal++;

    }

    public void addTieTotal() {

        TieTotal++;

    }

    public void addGoalsTotal(int g) {

        GoalsTotal += g;

    }

    public void addAllowedGoalsTotal(int g) {

        AllowedGoalsTotal += g;

    }

    public String toString() {

        return TeamName + "W: " + WinTotal + " L: " + LossTotal + " T: " + TieTotal;
    }

    
    
    // Getters for Team class
    public String getTeamName() {

        return TeamName;

    }

    public int getWinTotal() {

        return WinTotal;

    }

    public int getLossTotal() {

        return LossTotal;

    }

    public int getGoalsTotal() {

        return GoalsTotal;

    }

    public int getTieTotal() {

        return TieTotal;

    }

    public int getAllowedGoalsTotal() {

        return AllowedGoalsTotal;

    }
}
