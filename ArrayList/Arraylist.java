/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Arraylist {
    static void print(ArrayList<String> arr)
    {
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList(Arrays.asList("Ginerva","Harry","Luna","Hermione","Ronald","Neville"));
        ArrayList<String> arr2=new ArrayList(Arrays.asList("Dean","Seamus","Hannah","Paravati"));
        print(arr);
        arr.addAll(arr2);                                                       //use of addAll
        System.out.println("Cedric added \t\t\t"+arr.add("Cedric"));            //adding element in arraylist
        System.out.println("Arraylist Contains Harry\t"+arr.contains("Harry")); //Contains a lement or not
        System.out.println("Value at 2\t\t\t"+arr.get(2));                      //getting a value from aposition
        System.out.println("Index of Harry is\t\t"+arr.indexOf("Harry"));       //Index of a element
        System.out.println("Last index of Luna is\t\t"+arr.lastIndexOf("Luna"));//LAstindex of any value
        System.out.println("Removing at position 1\t\t"+arr.remove(1));         //removing any element from a position
        System.out.println("Setting value Padma at 2\t"+arr.set(2,"Padma"));    //setting value at a position
        System.out.println("Size of ArrayList is\t\t"+arr.size());              //Size of arraylist
        System.out.println("Sublist is\t\t\t"+arr.subList(0,3));                //creating sublist
        print(arr);
        arr.clear();                                                            //clearing a arraylist
        System.out.println("Arraylist is empty\t\t"+arr.isEmpty());             
    }
}
