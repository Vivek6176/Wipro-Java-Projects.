/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.train;
import java.util.Random;
public class TestCompartment {
    public static void main(String a[])
    {
        try{
        Compartment[] arr=new Compartment[10];
        Random ra=new Random();
        for(int i=0;i<10;i++){
        int n=ra.nextInt(4)+1;
        switch(n)
        {
            case 1:
                arr[i]=new FirstClass();
                break;
            case 2:
                arr[i]=new General();
                break;
            case 3:
                arr[i]=new Ladies();
                break;
            case 4:
                arr[i]=new Luggage();
                break;
            default:
                System.out.println("Wrong input...");
                System.exit(0);
        }
        }
        for(int i=0;i<10;i++)
            System.out.println(arr[i].notice());
        }
        catch(Exception e)
        {
            System.out.println("Wrong input...");
        }
    }
}
