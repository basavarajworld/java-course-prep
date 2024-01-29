import java.time.LocalDate;

/**
 * Represents a game between two teams.
 *
 * @param arena The name of the arena where the game takes place.
 */
public class Game {

    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }

    /**
     * Begins a basketball game between two teams.
     *
     * @param home The home team
     * @param away The away team
     */
    public void begin(Team home, Team away) {
        /**
         * Prints the details of a basketball matchup, including the arena, teams, and
         * starting lineups.
         *
         * @param home  The home team in the matchup
         * @param away  The away team in the matchup
         * @param arena The arena where the matchup takes place
         */
        System.out.println(
                "\n - This matchup takes place at the " + this.arena + " arena on " + "<day/month/year>" + "." +
                        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
                        "\n - The starting lineup for the home team is: at point guard, " + "<HOME_POINT_GUARD>"
                        + "; at shooting guard, " + "<HOME_SHOOTING_GUARD>" + "; at small forward, "
                        + "<HOME_SMALL_FORWARD>" + "; at power forward, " + "<HOME_POWER_FORWARD>" + "; and at center, "
                        + "<HOME_CENTER>" + ".\n" +
                        "\n - The starting lineup for the visiting team is: at point guard, " + "<AWAY_POINT_GUARD>"
                        + "; at shooting guard, " + "<AWAY_SHOOTING_GUARD>" + "; at small forward, "
                        + "<AWAY_SMALL_FORWARD>" + "; at power forward, " + "<AWAY_POWER_FORWARD>" + "; and at center, "
                        + "<AWAY_CENTER>" + ".\n" +
                        "\n - Let's give a warm round of applause for both teams as they take the court!");
    }

}
