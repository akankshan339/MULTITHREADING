//creating threads by using runnable interface 
import java.util.*;
import java.lang.*;
public class testRunnable implements Runnable{
    public void run()
    {
        System.out.println("This is an example by creating threads by using runnable interface :");
    }

    public static void main(String[] args) {
        testRunnable t = new testRunnable();
        Thread th = new Thread(t);  //since we have not extended thread class so we created obj of thread class and pass obj of test class
        th.start();
    }
    
}
