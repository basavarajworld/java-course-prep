package ThreadJoining;

import java.util.Random;

/**
 * Represents a player thread that generates a random score.
 */
public class PlayerThread extends Thread {

    private int score;
    private Random random = new Random();

    /**
     * Constructs a new PlayerThread object with the specified player number.
     *
     * @param playerNumber The number assigned to the player
     */
    public PlayerThread(int playerNumber) {
        this.score = 0;
        /**
         * Sets the name of the player to the specified player number.
         *
         * @param playerNumber The player number to set as the name
         */
        this.setName(Integer.toString(playerNumber));
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Random getRandom() {
        return this.random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    /**
     * Simulates the running of a player's game session.
     * The player's score is increased by a random value between 0 and 10,
     * 300,000,000 times.
     * Prints the final score of the player after the loop.
     */
    public void run() {
        for (int i = 0; i < 300000000; i++)
            this.setScore(this.getScore() + random.nextInt(10)); // Increment score by up to 10 points
        System.out.println("Player " + this.getName() + " final score: " + this.getScore());
    }

}
