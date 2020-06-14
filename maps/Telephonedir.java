/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;
import java.util.*;
public class Telephonedir {
    public static void main(String args[])
    {
        HashMap<String, Integer> ContactList=new HashMap<>();
        ContactList.put("Vivek", 89501);
        ContactList.put("xyz", 65464);
        ContactList.put("k", 2211);
        System.out.println("Checking if key Vivek exist or not : "+ContactList.containsKey("Vivek"));
        System.out.println("Checking if key Vivek exist or not : "+ContactList.containsKey("V"));
        System.out.println("Checking if value 89501 exist or not : "+ContactList.containsValue(89501));
        System.out.println("Checking if value 22222 exist or not : "+ContactList.containsValue(22222));
        Iterator itr=ContactList.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
