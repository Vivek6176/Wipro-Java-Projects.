package Exceptionhandling;
import java.util.Scanner;
public class trycatchfinally {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt(), b=sc.nextInt();
            int c=a/b;
            System.out.println("Quotient is "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e+" caught");
        }
        finally{
            System.out.println("Inside finally block...");
        }
    }
}
