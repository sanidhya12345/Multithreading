package ThreadBasics;

public class Hello {
    public static void main(String[] args) {

        World world=new World(); //NEW STATE
        world.start(); //RUNNABLE STATE
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
