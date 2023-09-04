package home.amit.java.multithreading.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreRunner {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        List<Integer> sharedList = new ArrayList<>();
        Thread incrementThread = new Thread(new IncrementThread(semaphore, "IncrementThread", sharedList));
        Thread decrementThread = new Thread(new DecrementThread(semaphore, "DecrementThread", sharedList));
        incrementThread.start();
        decrementThread.start();
    }
}
