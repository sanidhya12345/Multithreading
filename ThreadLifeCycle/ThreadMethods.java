package ThreadLifeCycle;

public class ThreadMethods extends Thread {

    @Override
    public void run() {
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1=new ThreadMethods();
        t1.start();
        t1.join(); //main thread waits for t1 to finish its execution
        System.out.println("Hello");
    }
}
