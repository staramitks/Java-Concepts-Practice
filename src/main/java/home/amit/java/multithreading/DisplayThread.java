package home.amit.java.multithreading;

public class DisplayThread implements Runnable {

    private final QueueDataThreadCoordinator queueDataHolder;


    public DisplayThread(QueueDataThreadCoordinator queueDataHolder) {

        this.queueDataHolder = queueDataHolder;
    }

    @Override
    public void run() {

        while (true) {
            boolean endFlag = (queueDataHolder.getDataObjectDTO().getDataQueue().peek() != null) && (queueDataHolder.getDataObjectDTO().getDataQueue().peek().equalsIgnoreCase("FOE"));

            queueDataHolder.displayElement();

            if (endFlag) {
                System.out.println("Exiting " + Thread.currentThread().getName());
                break;
            }
        }
    }

}
