public class Main {
    public static void main(String[] args) {
        SportsTeam thisSportsTeam = new SportsTeam(97, 65, "Rayders");

        System.out.println(thisSportsTeam.winLossRatio(thisSportsTeam.getWins(), thisSportsTeam.getLosses()));
    }
}
