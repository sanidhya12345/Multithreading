package ThreadLifeCycle;

public class MyThread extends Thread {
    
    @Override
    public void run() {
        
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread(); //NEW State as it is only created not started yet
        System.out.println(t1.getState());
        t1.start();//RUNNABLE state now the threads become runnable but not running right now,it is waiting for CPU time.
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState()); //TIMED_WAITING
        t1.join(); //main thread is waiting for the thread t1 to complete its execution.
        System.out.println(t1.getState()); //TERMINATED
    }
}
