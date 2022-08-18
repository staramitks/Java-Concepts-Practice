package home.amit.java.config;

import javax.management.NotificationEmitter;
import java.lang.management.*;
import java.util.Date;
import java.util.TimerTask;

public class MemoryUsageTask extends TimerTask {

    String name;

    public MemoryUsageTask(String name)
    {
        this.name=name;
    }
    public void run(){

    MemoryPoolMXBean tenuredGen = ManagementFactory.getMemoryPoolMXBeans().stream()
            .filter(pool -> pool.getType() == MemoryType.HEAP)
            .filter(MemoryPoolMXBean::isUsageThresholdSupported)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(
                    "Can't find tenured generation MemoryPoolMXBean"));

    double threshold = 0.10;
    MemoryUsage usage = tenuredGen.getUsage();
    tenuredGen.setCollectionUsageThreshold((int)Math.floor(usage.getMax()
            * threshold));
    if (usage.getUsed() >= tenuredGen.getCollectionUsageThreshold() )
    {
        System.out.println("Reached Threshold Levels");
        double usagePercent=usage.getUsed()*100/usage.getMax();
        System.out.println("Total Available Memory is "+usage.getMax() + " and Used memory is "+usage.getUsed() + " .This is "+usagePercent +"% of max available memory");

    }

    NotificationEmitter notificationEmitter = (NotificationEmitter) ManagementFactory.getMemoryMXBean();
    notificationEmitter.addNotificationListener((notification, handback) -> {
        if (MemoryNotificationInfo.MEMORY_COLLECTION_THRESHOLD_EXCEEDED
                .equals(notification.getType())) {
            // Log, send an alert or whatever makes sense in your situation
            System.err.println("Running low on memory");
        }
        else{
            System.err.println("info - Running fine on memory");
        }
    }, null, null);
        System.out.println("[" + new Date() + "] " + name + ": task executed!");
}


}
