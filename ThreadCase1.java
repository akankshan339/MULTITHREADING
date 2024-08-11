//CASE 1: Performing single task from single thread
import java.lang.*;
import java.util.*;

public class ThreadCase1 extends Thread {
    public void run()
    {
        System.out.println("Thread task 1 to be done by thread ");
    }
    public static void main(String[] args) {
        ThreadCase1 t = new ThreadCase1();  //creating single thread
        t.start();

    }
    
}
