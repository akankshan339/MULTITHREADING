//CASE : Performing multiple task from multiple thread
import java.lang.*;
import java.util.*;

 class test1 extends Thread {
    public void run()
    {
        System.out.println("Performing task 1 from thread 1: ");
    }
}

 class test2 extends Thread {
    public void run()
    {
        System.out.println("Performing task 2 from thread 2: ");
    }
}

//class having main func will have public class
public class ThreadCase4 {
    public static void main(String[] args) {
        test1 t1 = new test1(); //creating thread 1
        t1.start();

        test2 t2 = new test2(); //creating thread 2
        t2.start();

    }
    
}



