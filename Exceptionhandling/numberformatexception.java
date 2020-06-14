package Exceptionhandling;
import java.util.*;

public class numberformatexception {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);		
    String x=sc.nextLine();
    try{    
        int n=Integer.parseInt(x);
        System.out.println("Square of "+n+" is "+n*n);
    }
    catch(NumberFormatException e){
        System.out.println("Entered input is not a valid format for an integer");
    }
    }
}