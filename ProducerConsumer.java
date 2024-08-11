class Utility 
{
    int i;
    boolean bool = false;

    synchronized public void set(int i) throws InterruptedException
    {
        while(bool)
        {
            wait();
        }
        this.i = i;
        bool = true;
        System.out.println("Producer " + i);
        notify();
    }

    public synchronized void get() throws InterruptedException
    {
        while(!bool)
        {
            wait();
        }
       // this.i= i;    //no need to set value of i since we are getting
        bool = false;
        System.out.println("Consumer " +i);
        notify();
    }
}


class Consumer implements Runnable{
    public Utility utilob;
   public Consumer(Utility utilob)
    {
        this.utilob = utilob;
        Thread cons = new Thread(this, "Consumer");
        cons.start();
    }

    public void run()
    {
        while(true)
        {
            try
            {
            utilob.get();
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
              //  e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable{
    public Utility utilob;
    public Producer(Utility utilob)
    {
        this.utilob = utilob;
        Thread pro = new Thread(this, "Producer");
        pro.start();
    }

    public void run()
    {
        int i =0;
        while(true)
        {
            try
            {
            utilob.set(i++);
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Utility utilob = new Utility();
        new Producer(utilob);
        new Consumer(utilob);
    }   
}
