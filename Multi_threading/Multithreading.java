
package Multi_threading;
public class Multithreading extends Thread {
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
        t2.start();
        t3.start(); 
  }
}
