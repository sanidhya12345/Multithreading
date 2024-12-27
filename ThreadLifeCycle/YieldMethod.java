package ThreadLifeCycle;

public class YieldMethod extends Thread{
    
    public YieldMethod(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield(); //hum scheduler ko hint de rahe hai ki dusre thread ko bhi mauka de dijiye baaki apki marji
        }
    }

    public static void main(String[] args) {
        YieldMethod t1=new YieldMethod("t1");
        YieldMethod t2=new YieldMethod("t2");
        t1.start();
        t2.start();

        //without using yield output: 

        // t2 is running
        // t2 is running
        // t1 is running
        // t1 is running
        // t1 is running
        // t1 is running
        // t1 is running
        // t2 is running
        // t2 is running
        // t2 is running

        //using yield output:
        // t1 is running
        // t1 is running
        // t2 is running
        // t1 is running
        // t2 is running
        // t1 is running
        // t2 is running
        // t2 is running
        // t2 is running
        // t1 is running

    }
}
