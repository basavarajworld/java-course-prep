import java.util.HashMap;
import java.util.Map;

/**
 * Represents a team with a name and a map of players.
 */

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }

    /**
     * Returns the name associated with this object.
     *
     * @return The name of the object.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the object.
     *
     * @param name The new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the player at the specified position.
     *
     * @param position The position of the player.
     * @return The player at the specified position, or null if no player is found.
     */
    public String getPlayer(String position) {
        return this.players.get(position);
    }

    /**
     * Sets the player at the specified position.
     *
     * @param position The position of the player.
     * @param player   The name of the player.
     */
    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }

}
