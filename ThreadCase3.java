//CASE 3: Performing multiple task from single thread 
//this is not possible in java

import java.lang.*;
import java.util.*;
public class ThreadCase3 extends Thread{

    public void run()
    {
        System.out.println("Performing single task from multiple thread ");
    }

    //  public void run()
    // {
    //     System.out.println("Performing single task from multiple thread ");
    // }

    public static void main(String[] args) {
        ThreadCase3 t1 = new ThreadCase3(); //creating thread 1
        t1.start();
    }
    
}
