//creating threads by extending thread class
import java.io.*;
//import java.util.*;
import java.lang.*;
public class TestThread extends Thread{
    //overriding run() method
    public void run()
    {
        //thread task
        System.out.println("This is an example how threads are created ");
    }
    public static void main(String args[])throws IOException
    {
        TestThread t = new TestThread();    //creating thread
        t.start();                          //starting thread

        t.start();//Exception in thread "main" java.lang.IllegalThreadStateException
    //once thread got dead then it cannot be started again it will give error
    }
    
}
