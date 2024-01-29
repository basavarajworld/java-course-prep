public class Main {

    /**
     * The main method initializes two teams, "Chicago Bulls" and "Detroit Pistons",
     * and sets their players.
     * The players are assigned positions such as "SHOOTING_GUARD", "SMALL_FORWARD",
     * "POWER_FORWARD", "CENTER", and "POINT_GUARD".
     * After initializing the teams, a game is created at "Etihad Stadium" and the
     * game begins with the two teams.
     */
    public static void main(String[] args) {

        /**
         * Creates a new team with the given name and sets the players for each
         * position.
         *
         * @param teamName The name of the team.
         * @return The newly created team object.
         */
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer("SHOOTING_GUARD", "Michael Jordan");
        bulls.setPlayer("SMALL_FORWARD", "Scottie Pippen");
        bulls.setPlayer("POWER_FORWARD", "Dennis Rodman");
        bulls.setPlayer("CENTER", "Bill Wennington");
        bulls.setPlayer("POINT_GUARD", "Randy Brown");

        /**
         * Creates a new team with the given name and sets the players for each
         * position.
         *
         * @param teamName The name of the team.
         * @return The created team object.
         */
        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer("SHOOTING_GUARD", "Joe Dumars");
        pistons.setPlayer("SMALL_FORWARD", "Grant Hill");
        pistons.setPlayer("POWER_FORWARD", "Otis Thorpe");
        pistons.setPlayer("CENTER", "William Bedford");
        pistons.setPlayer("POINT_GUARD", "Isiah Thomas");

        /**
         * Creates a new game instance with the specified stadium name and begins the
         * game between the specified teams.
         *
         * @param stadiumName The name of the stadium where the game is being played
         * @param homeTeam    The home team participating in the game
         * @param awayTeam    The away team participating in the game
         */
        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
    }

}
