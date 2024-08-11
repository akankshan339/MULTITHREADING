//Daemon thread runs in the background of other thread and provide service to the threads 
//eg garvage collector , finalizer, spelling checker
import java.lang.*;
import java.util.*;
public class DaemonThread extends Thread{
    public void run()
    {
        //Thread.currentThread.setDaemon(true);
        System.out.println("Child Thread ");
        System.out.println("Deamon Thread ");
    }
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Main Thread ");   //if there is no task in main thread then daemon thread will not execute
       
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();

        DaemonThread t2 = new DaemonThread();
        t2.start();
        t2.setDaemon(true);
    }
    
}
