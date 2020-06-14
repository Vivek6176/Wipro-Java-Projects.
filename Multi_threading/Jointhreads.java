package Multi_threading;
public class Jointhreads extends Thread {
    @Override
    public void run() 
    {
    for(int i=1;i<3;i++){  
        try{
            System.out.println(Thread.currentThread().getName()+"  "+i);
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(e);
            }
        }  
    }
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        Multithreading t2 = new Multithreading();
        Multithreading t3 = new Multithreading();
        t1.start();
        try
        { 
            System.out.println("Current Thread: "+ Thread.currentThread().getName()); 
            t1.join(); 
        } 
        catch(Exception ex) 
        { 
            System.out.println("Exception has been caught " + ex); 
        } 
        t2.start(); 
        try
        { 
            System.out.println("Current Thread: "+ Thread.currentThread().getName()); 
            t2.join(); 
        } 
        catch(Exception ex) 
        { 
            System.out.println("Exception has been caught" + ex); 
        } 
        t3.start(); 
  }
}
