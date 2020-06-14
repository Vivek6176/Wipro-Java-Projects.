/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;
import java.util.*;
public class Riddles_diary{
    static HashMap<String, String> rel=new HashMap<>();
    static public String checkkey(String Name) {
        if(rel.containsKey(Name))
            return rel.get(Name);
        else
            return "No key "+Name;
    }
    static public String checkvalue(String value) {
        if(rel.containsValue(value))
        {
            Set<Map.Entry<String,String>> set=rel.entrySet();
            Iterator<Map.Entry<String, String>> itr=set.iterator();
            while(itr.hasNext()) {
                Map.Entry<String,String> x=itr.next();       
                    if (x.getValue().equals(value))
                        return x.getKey();
            }
        }
        return "No value "+value;
    }
    public static void main(String[] args) {
        rel.put("Harry","Ginny");
        rel.put("Ron","Hermione");
        rel.put("George","Angela");
        rel.put("Bill","Fleur");
        System.out.println("Checking for Harry -"+checkkey("Harry"));
        System.out.println("Checking for Albus -"+checkkey("Albus"));
        System.out.println("Checking for Fleur -"+checkvalue("Fleur"));
        System.out.println("Checking for Luna -"+checkkey("Luna"));
        Iterator<Map.Entry<String, String>> itr=rel.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, String> x=itr.next();
            System.out.println(x.getKey()+" is married to "+x.getValue());
        }
    }
}

