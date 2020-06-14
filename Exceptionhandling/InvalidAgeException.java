package Exceptionhandling;
import java.util.Scanner;
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String x){}
    static void check(int age)throws InvalidAgeException{  
     if(age<18 || age>60)  
      throw new InvalidAgeException("Not Valid");    
    }
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        try{
        String name=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());
        check(age);
        System.out.println("Name: "+name+"\tAge"+age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
