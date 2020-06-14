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
public class Linklist {
    static void print(LinkedList<String> list)
    {
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList();
        list.add("Albus");
        ArrayList<String> arr=new ArrayList(Arrays.asList("Ginerva","Harry","Luna","Hermione","Ronald","Neville"));
        list.addAll(arr);                                                        //addall
        print(list);
        System.out.println("Cedric added \t\t\t"+list.add("Cedric"));            //adding element in linkedlist
        System.out.println("Linkedlist Contains Harry\t"+list.contains("Harry")); //Contains a lement or not
        System.out.println("Value at 2\t\t\t"+list.get(2));                      //getting a value from aposition
        System.out.println("Index of Harry is\t\t"+list.indexOf("Harry"));       //Index of a element
        System.out.println("Last index of Luna is\t\t"+list.lastIndexOf("Luna"));//LAstindex of any value
        System.out.println("Removing at position 1\t\t"+list.remove(1));         //removing any element from a position
        System.out.println("Setting value Padma at 2\t"+list.set(2,"Padma"));    //setting value at a position
        System.out.println("Size of LinkedList is\t\t"+list.size());              //Size of arraylist
        System.out.println("Sublist is\t\t\t"+list.subList(0,3));                //creating sublist
        list.add("Minerva");
        System.out.println(list.removeLastOccurrence("Padma"));                  //removing last occurance of any element
        list.addFirst("Albus");                                                  //adding elemment at first 
        list.addLast("Quennie");                                                   //adding element at last
        System.out.println("Elements in list are:");
        print(list);
        System.out.println("Element at first is\t "+list.getFirst());            //Getting first element
        System.out.println("Element at last is\t "+list.getLast());                //getting last element 
        System.out.println("Element at first is\t"+list.peek());
        System.out.println("Element at first is\t"+list.peekFirst());
        System.out.println("Element at last is\t"+list.peekLast());
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.pop());
        System.out.println("Elements in list are:");
        print(list);
        ListIterator itr = list.listIterator();
         System.out.println("Iterating from start:");
         while(itr.hasNext())
         {
            System.out.println(itr.next());
         }
         System.out.println("Iterating from last");
          while(itr.hasPrevious())
          {
            System.out.println(itr.previous());
          } 
        list.clear();                                                            //clearing a arraylist
        System.out.println("Linkedlist is empty\t\t"+list.isEmpty());    
    }
}
