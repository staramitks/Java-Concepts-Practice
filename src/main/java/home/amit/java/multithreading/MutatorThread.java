package home.amit.java.multithreading;

public class MutatorThread implements Runnable {

    private final QueueDataThreadCoordinator queueDataHolder;


    public MutatorThread(QueueDataThreadCoordinator queueDataHolder) {

        this.queueDataHolder = queueDataHolder;
    }

    @Override
    public void run() {

        while (true) {
            queueDataHolder.reverseElement();

            if ((queueDataHolder.getDataObjectDTO().getDataQueue().peek() != null) && (queueDataHolder.getDataObjectDTO().getDataQueue().peek().equalsIgnoreCase("FOE"))) {
                System.out.println("Exiting " + Thread.currentThread().getName());
                break;
            }
        }
    }

}
