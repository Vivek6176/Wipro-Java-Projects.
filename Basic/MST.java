/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;
public class MST {
    public static void main(String args[])
    {
        TreeSet<Integer> x=new TreeSet<>();
        System.out.println(x.add(1));
        System.out.println(x.add(2));
        System.out.println(x.add(3));
        System.out.println(x.add(4));
        System.out.println(x.add(5));
        System.out.println(x.contains(1));
        System.out.println(x.first());
        System.out.println(x.last());
        Iterator ir=x.iterator();
        while(ir.hasNext())
            System.out.println(ir.next());
        Iterator ire=x.descendingIterator();
        while(ire.hasNext())
            System.out.println(ire.next());
        System.out.println(x.pollFirst());
        System.out.println(x.pollLast());
        System.out.println(x.subSet(1, 3));
        System.out.println(x.size());
        System.out.println(x.remove(1));
                while(ir.hasNext())
            System.out.println(ir.next());
    }
}
