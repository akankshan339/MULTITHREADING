//getting and setting thread name
import java.lang.*;
import java.util.*;
public class ThreadName extends Thread{
    public void run()
    {
       // Thread.currentThread().setName("Akanksha");
        System.out.println("Thread  name is :"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       // Thread.currentThread().setName("Akku");   //setting main thread name 

        System.out.println("Thread Name is: " +Thread.currentThread().getName());
       // System.out.println(10/0);   //Arithmetic Exception in thread main

        System.out.println("After setting new name to thread 1: is :");
        ThreadName tn1 = new ThreadName();
        tn1.setName("Akanksha");    //we can set here or above inside run func
        tn1.start();

        System.out.println("After setting new name to thread 2: is :");
        ThreadName tn2 = new ThreadName();
       // tn2.setName("Negi");
        tn2.start();

        ThreadName tn3 = new ThreadName();
        ///checking before thread is dead
        System.out.println(Thread.currentThread().isAlive());
    
        tn3.start();
//checking after thread is dead
        boolean b =tn3.isAlive();
        System.out.println(b);
    }
}
