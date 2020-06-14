/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.*;
public class String_arraylist {
    public static void printall(ArrayList<String> x)
    {
        Iterator itr=x.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
            arr.add(sc.nextLine());
        printall(arr);
    }
}
