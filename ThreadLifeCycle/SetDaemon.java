package ThreadLifeCycle;

//daemon threads(background threads) are those threads for which JVM never waits.

public class SetDaemon extends Thread{

    @Override
    public void run() {
         while(true){
           System.out.println("Hello world!");
         }    
    }
    public static void main(String[] args) {
        SetDaemon s=new SetDaemon();
        s.start();
    }
}