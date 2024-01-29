public class ThreadPriority {
    public static void main(String[] args) {
        /**
         * Creates a new thread that executes the count() method.
         *
         * @return The newly created thread.
         */
        Thread newThread1 = new Thread(() -> count(), "Thread 1");
        Thread newThread2 = new Thread(() -> count(), "Thread 2");
        Thread newThread3 = new Thread(() -> count(), "Thread 3");

        /**
         * Sets the priority of the specified threads.
         *
         * @param newThread1 The first thread to set the priority for
         * @param newThread2 The second thread to set the priority for
         */
        newThread1.setPriority(Thread.MAX_PRIORITY);
        newThread2.setPriority(Thread.NORM_PRIORITY);
        newThread1.setPriority(Thread.MIN_PRIORITY);

        /**
         * Starts three new threads concurrently.
         * 
         * @param newThread1 The first thread to start.
         * @param newThread2 The second thread to start.
         * @param newThread3 The third thread to start.
         */
        newThread1.start();
        newThread2.start();
        newThread3.start();
    }

    /**
     * Prints numbers from 0 to 19 along with the name of the current thread.
     * This method is intended to be executed concurrently by multiple threads.
     */
    public static void count() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
