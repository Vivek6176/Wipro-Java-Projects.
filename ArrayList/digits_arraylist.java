/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.*;
public class digits_arraylist {
    public static void main(String args[])
    {
        ArrayList<Double> arr=new ArrayList();
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
                arr.add(sc.nextDouble());
            Iterator itr=arr.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("Wrong input...");
        }
    }
}
