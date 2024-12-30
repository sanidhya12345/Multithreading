package Synchronization;

public class Counter {
    
    private int count=0;

    //before synchronized it is not guranteed that after completing execution of both thread 
    // the counter value will give consistent results
    
    //after synchronized keyword used with the member functions always give you consistent results.


    //prevents race condition by using synchronized keyword 

    public synchronized void increment(){
      
      //if you donot want to make the whole method synchronized then you can create a synchronized block 
      // inside that block you can wrote that code part which you want to synchronized.
        
    //   synchronized(this){
    //     count++;
    //   }
      count++;
    }
    public int getCount(){
        return count;
    }
}
