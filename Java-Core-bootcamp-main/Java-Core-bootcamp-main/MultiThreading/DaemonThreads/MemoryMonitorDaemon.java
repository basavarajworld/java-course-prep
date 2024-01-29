package DaemonThreads;

public class MemoryMonitorDaemon implements Runnable {
    @Override
    public void run() {
        /**
         * Retrieves the current runtime environment.
         *
         * @return The runtime environment.
         */
        Runtime runtime = Runtime.getRuntime();

        /**
         * Continuously monitors the memory usage of the application.
         * Prints the used memory in bytes every 5 seconds.
         * If the thread is interrupted, it prints a message indicating that the memory
         * monitor was interrupted.
         */
        while (true) {
            try {
                /**
                 * Calculates the amount of memory currently being used by the application.
                 *
                 * @return The amount of memory being used, in bytes.
                 */
                long usedMemory = runtime.totalMemory() - runtime.freeMemory();
                System.out.println("Memory Usage: " + usedMemory + " bytes");
                Thread.sleep(5000); // Check memory usage every 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Memory monitor interrupted");
            }
        }
    }
}
