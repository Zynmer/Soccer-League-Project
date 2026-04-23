import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Team Names
        Team[] teams = {

            new Team("Dragon"),
            new Team("Large Feet"),
            new Team("Couger"),
            new Team("Long Legs")

        };
        // Code after comment allows everything to remain in JOptionPane / UI
        Scheduler scheduler = new Scheduler(teams);

        while (true) {

            String[] options = {
                "Week",
                "View Teams",
                "View Games",
                "Exit"

            };

            int choice = JOptionPane.showOptionDialog(
                
                null,
                "Soccer League",
                "Main Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]

            );

            switch (choice) {

                case 0 -> Temp(scheduler);
                case 1 -> showTeams(scheduler);
                case 2 -> showGames(scheduler);
                default -> {return;}

            }
        }    
    }

    static void Temp(Scheduler scheduler) {

        String input = JOptionPane.showInputDialog("Enter temperature: ");

        try {

            double temp = Double.parseDouble(input);
            boolean cont = scheduler.Temp(temp);

            if (!cont) {

                JOptionPane.showMessageDialog(null, "Winter has arrived! The season is over.");

            }
        } 
       catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Invalid Input");
        
        }
    }

    static void showTeams(Scheduler scheduler) {

        String output = scheduler.getTeamsSummary();
        JOptionPane.showMessageDialog(null, output);

    }

    static void showGames(Scheduler scheduler) {

        String output = scheduler.getGamesSummary();
        JOptionPane.showMessageDialog(null, output);

    }

        
    
}
