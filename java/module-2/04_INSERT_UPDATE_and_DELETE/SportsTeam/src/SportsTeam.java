import java.util.*;

public class SportsTeam {

    private int wins;
    private int losses;
    private String teamName;

    public SportsTeam(int wins, int losses, String teamName) {
        this.wins = wins;
        this.losses = losses;
        this.teamName = teamName;
    }

    public String winLossRatio(int wins, int losses){
        if (losses == 0) {
            return String.valueOf(wins);
        } else {
            double winsAsDouble = wins;
            double lossesAsDouble = losses;
            return String.valueOf((winsAsDouble/(winsAsDouble+lossesAsDouble))*100);
        }
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getTeamName() {
        return teamName;
    }
}
