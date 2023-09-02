package home.amit.java.multithreading;

/*

For long and double usage of volatile is must even for getters and setters as this is not atomic for these type of variables.
When a variable is declared as volatile, it tells the Java Virtual Machine (JVM) that the variable's value may be modified by multiple threads concurrently.
This ensures that the variable's value is always read from and written to the main memory (shared memory) instead of being cached in a thread's local memory
1) Visibility: When a variable is marked as volatile, any thread that reads the value of the variable will always see the most recent value written to it by any other thread.
In other words, changes made by one thread to the volatile variable are immediately visible to other threads.

2) No Atomicity: While volatile ensures visibility, it does not guarantee atomicity for compound actions. For example, operations like incrementing a volatile variable (e.g., counter++) are not atomic
and can still lead to race conditions in a multi-threaded environment.

3) Ordering: The volatile keyword also ensures that the JVM respects the order in which read and write operations on the variable occur.
For example, if one thread writes to the variable, and then another thread reads from it, the JVM guarantees that the read operation will see the write operation's effects.

 */
public class VolatileKeyword {

    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT < 5) {
                System.out.println("Incrementing MY_INT to : " + (local_value + 1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
