package ThreadLifeCycle;

public class InterruptThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
    }
    public static void main(String[] args) {
        InterruptThread t1=new InterruptThread();
        t1.start();
        t1.interrupt(); //whatever this thread is currently working gets interrrupted by this method
        /*
         * java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleepNanos0(Native Method)
        at java.base/java.lang.Thread.sleepNanos(Thread.java:491)
        at java.base/java.lang.Thread.sleep(Thread.java:522)
        at ThreadLifeCycle.InterruptThread.run(InterruptThread.java:8) 
         */
    }
}
