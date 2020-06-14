package Exceptionhandling;
import java.util.Scanner;
public class division { 
    int divide(int a, int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String ar[])
    {
        division obj=new division(); 
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(obj.divide(a,b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
