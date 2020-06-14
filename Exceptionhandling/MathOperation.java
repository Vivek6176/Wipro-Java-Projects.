package Exceptionhandling;
import java.util.*;
public class MathOperation{
    Scanner sc=new Scanner(System.in);
    int sum=0,arr[]=new int[5];
    void getElements(int arr[]) throws NumberFormatException
    {
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(sc.nextLine());    
    }
    int sum(int arr[]) throws ArithmeticException
    {
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        return sum;
    }
    int average(int arr[]) throws ArithmeticException
    {
        return sum(arr)/arr.length;
    }
    public static void main(String a[])
    {
        MathOperation obj=new MathOperation();
        try{
            int[] arr1 = obj.arr;
            System.out.println("Enter elements in array: ");
            obj.getElements(arr1);
            System.out.println("Sum of array is "+obj.sum(arr1));
            System.out.println("Average of array is "+obj.average(arr1));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
