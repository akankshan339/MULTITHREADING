//CASE 2: Performing single task from multiple thread
import java.lang.*;
import java.util.*;

public class ThreadCase2 extends Thread{
    public void run()
    {
        System.out.println("Performing single task from multiple thread ");
    }

    public static void main(String[] args) {
        ThreadCase2 t1 = new ThreadCase2(); //creating thread 1
        t1.start();

        ThreadCase2 t2 = new ThreadCase2(); //creating thread 2
        t2.start();

    }
    
}
