package Thread_inheritance;

public class AthleteThread extends Thread {
    /**
     * The bib number assigned to a participant.
     */
    private int bibnumber;

    /**
     * Constructs a new AthleteThread object with the given bib number.
     *
     * @param bibnumber The bib number of the athlete
     */
    public AthleteThread(int bibnumber) {
        this.bibnumber = bibnumber;
    }

    public int getBibnumber() {
        return this.bibnumber;
    }

    public void setBibnumber(int bibnumber) {
        this.bibnumber = bibnumber;
    }

    @Override
    public void run() {
        double distanceKM = 10;
        double steps = 0.00000001;

        /**
         * Simulates an athlete's progress in a race by iterating over a distance in
         * steps.
         * If the athlete's progress is within a step's distance to the total distance,
         * it is considered finished.
         *
         * @param distanceKM The total distance of the race in kilometers
         * @param steps      The distance covered in each step
         * @param bibNumber  The number assigned to the athlete
         */
        for (double i = 0; i <= distanceKM; i += steps) {
            if (Math.abs(i - distanceKM) < steps) {
                System.out.println("\nAthlete number " + bibnumber + " has finished the race.\n");
                break;
            }
        }
    }
}