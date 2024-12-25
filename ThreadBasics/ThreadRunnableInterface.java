package ThreadBasics;

public class ThreadRunnableInterface implements Runnable {
    
    @Override
    public void run() {
       
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
