package Synchronization.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    
    private int balance=100;

    private final Lock lock=new ReentrantLock();
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        // if(balance>=amount){
        //     System.out.println(Thread.currentThread().getName()+" proceeding with withdrawals");
        //     try {
        //         Thread.sleep(10000);
   
        //     } catch (InterruptedException e) {
        //     } 
        //     balance-=amount;
        //     System.out.println(Thread.currentThread().getName()+"completed withdrawal.Remaining Balance: "+balance);    
        // }
        // else{
        //     System.out.println(Thread.currentThread().getName()+" insufficient balance");
        // }


        //lock.trylock(): without time means if the lock is free then thread immediately acquire the lock.
        //Acquires the lock if it is free within the given waiting time and the current thread has not been interrupted.
        if(lock.tryLock(amount, null))
    }
}
