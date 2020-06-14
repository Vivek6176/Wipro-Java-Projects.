package Exceptionhandling;
import java.util.Scanner;
public class arrayindexoutofbound {
public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    try{
        int n=Integer.parseInt(sc.nextLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(sc.nextLine());
        int x=Integer.parseInt(sc.nextLine());
        System.out.println(arr[x]);
    }
    catch (Exception e){
        System.out.println(e);
    }
}
}
