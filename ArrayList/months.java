/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;
public class months {
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList();
        arr.add("January");
        arr.add("February");
        arr.add("March");
        arr.add("April");
        arr.add("May");
        arr.add("June");
        arr.add("July");
        arr.add("August");
        arr.add("September");
        arr.add("October");
        arr.add("November");
        arr.add("December");
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
