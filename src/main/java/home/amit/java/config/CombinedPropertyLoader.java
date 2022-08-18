package home.amit.java.config;

import jdk.jshell.execution.Util;
import org.apache.commons.configuration2.CombinedConfiguration;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.combined.CombinedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

import javax.management.NotificationEmitter;
import java.lang.management.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CombinedPropertyLoader {

    private static CombinedPropertyLoader instance;
    private CombinedConfiguration configuration;

    private CombinedPropertyLoader() {
        Parameters params = new Parameters();
        CombinedConfigurationBuilder builder = new CombinedConfigurationBuilder()
                .configure(params.fileBased().setFileName("config.xml"));
        try {
            configuration = builder.getConfiguration();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }

        Configuration prodConfig = configuration.subset("puuwlp145");
        String serverName=prodConfig.containsKey("service.addr")?(String)prodConfig.getProperty("service.addr"):null;
        String serverPort=prodConfig.containsKey("service.port")?(String)prodConfig.getProperty("service.port"):null;
        System.out.println("Name and Ports are "+serverName+":"+serverPort);
    }


    private void loadJVM() throws Exception
    {

        int arrSize = 15;
        System.out.println("Maximum memory " + Runtime.getRuntime().maxMemory());
        long memoryConsumed = 0;
        try {
            List<String> list = new ArrayList<>();
            while (true)
            {
                list.add(String.valueOf(System.currentTimeMillis()));
                System.out.println("iteration count ");
            }



        } catch (OutOfMemoryError outofMemory) {
            System.out.println("Catching out of memory error");

            throw outofMemory;
        }
    }


    public static synchronized CombinedPropertyLoader getInstance() {
        if (instance == null) {
            instance = new CombinedPropertyLoader();
        }
        return instance;
    }

    public String getProperty(String key) {
        return (String) configuration.getProperty(key);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(CombinedPropertyLoader.getInstance().getProperty("prod-prop1"));
        System.out.println(CombinedPropertyLoader.getInstance().getProperty("prod-prop2"));
        System.out.println(CombinedPropertyLoader.getInstance().getProperty("prod-sysprop1"));

        MemoryUsageTask t1 = new MemoryUsageTask("Task 1");
        Timer t = new Timer();
        t.schedule(t1, 0,1000); //  executes for every 1 seconds
                CombinedPropertyLoader combinedPropertyLoader= new CombinedPropertyLoader();
                combinedPropertyLoader.loadJVM();
    }


}

