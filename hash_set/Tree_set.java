package hash_set;

import java.util.*;

public class Tree_set {
    public static void main(String args[])
    {
        TreeSet<String> set=new TreeSet<String>();
        set.add("Harry Potter");
        set.add("Hermione Granger");
        set.add("Ronald Weasley");
        set.add("Neville Longbottom");
        set.add("Luna Lovegood");
        set.add("Ginerva Weasley");
        System.out.println(set);
        Iterator ditr=set.descendingIterator();
        System.out.println("Reverse Treeset is---- \n");
        while(ditr.hasNext())
        {
            System.out.println(ditr.next());
        }
        Iterator itr=set.iterator();
        System.out.println("\nTreeset is---- \n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("\nHarry Potter present in treeset - "+set.contains("Harry Potter"));
        
    }
}
