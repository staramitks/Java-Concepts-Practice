package home.amit.java.basic.multithreading;

class MyThread implements Runnable {

    private String myName;


    @Override
    public void run() {
        try {
            for (int i = 20; i < 25; i++) {
                System.out.println(Thread.currentThread().getName() + " Printing " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}

public class ThreadAliveJoin {

    public static void main(String[] args) {


        Thread mythread1 = new Thread(new MyThread(), "First");
        Thread mythread2 = new Thread(new MyThread(), "Second");
        Thread mythread3 = new Thread(new MyThread(), "Third");
        mythread1.start();
        mythread2.start();
        mythread3.start();

        try {

            System.out.println(mythread1.isAlive());
            System.out.println(mythread2.isAlive());
            System.out.println(mythread3.isAlive());
        } catch (Exception e) {
            System.out.println("Failed in checking alive");
        }


        try {
            Thread.sleep(2000);
            mythread1.join();
            mythread2.join();
            mythread3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {

            System.out.println(mythread1.isAlive());
            System.out.println(mythread2.isAlive());
            System.out.println(mythread3.isAlive());
        } catch (Exception e) {
            System.out.println("Failed in checking alive");
        }

    }
}
