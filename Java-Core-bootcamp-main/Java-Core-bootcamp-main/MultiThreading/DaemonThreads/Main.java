package DaemonThreads;

public class Main {
    public static void main(String[] args) {
        /**
         * Creates and starts a new thread to monitor memory usage.
         * The thread runs an instance of the MemoryMonitorDaemon class.
         * The thread is set as a daemon thread, meaning it will not prevent the JVM
         * from exiting.
         */
        Thread memoryMonitorThread = new Thread(new MemoryMonitorDaemon());
        memoryMonitorThread.setDaemon(true); // after setting daemon the thread stops executing after the core thread
                                             // finishes executing
        memoryMonitorThread.start();

        /**
         * Creates a new thread and starts a memory-intensive task.
         * The memory-intensive task is implemented by the class MemoryIntensiveTask.
         */
        Thread memoryIntensiveTaskThread = new Thread(new MemoryIntensiveTask());
        memoryIntensiveTaskThread.start();
    }
}
