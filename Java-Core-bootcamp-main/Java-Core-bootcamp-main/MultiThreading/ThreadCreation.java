
/**
 * A class that demonstrates the creation and execution of a new thread.
 */
public class ThreadCreation {
    /**
     * A class that implements the Runnable interface to create a new thread.
     * The run method calls the count method.
     */
    public static class NewThread implements Runnable {
        @Override
        public void run() {
            count();
        }

    }

    /**
     * The main method of the program.
     * It creates a new thread and starts it, then calls the count() method.
     * This method is the entry point of the program.
     *
     * @param args The command line arguments passed to the program
     */
    public static void main(String[] args) {
        Thread newThread = new Thread(new NewThread(), "NewThread");
        newThread.start();
        count();
    }

    /**
     * Prints the numbers from 0 to 19.
     */
    public static void count() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}