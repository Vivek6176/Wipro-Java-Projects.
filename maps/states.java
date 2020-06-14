/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;
import java.util.*;
public class states {
    public static void main(String[] args) {
        Properties pr=new Properties();
        pr.setProperty("Haryana", "Chandigarh");
        pr.setProperty("Himachal Pradesh", "Shimla");
        pr.setProperty("Ladakh", "Leh");
        pr.setProperty("Uttrakhand", "Dehradun");
        pr.setProperty("Punjab", "Chandigarh");
        pr.setProperty("Sikkim", "Gangtok");
        pr.setProperty("Tamilnadu", "Chennai");
        pr.setProperty("Maharastra", "Mumbai");
        pr.setProperty("Gujrat", "Gandhinagar");
        pr.setProperty("Rajasthan", "Jaipur");
        pr.setProperty("Arunachal Pradesh", "Itanagar");
        pr.setProperty("Orrisa", "Bhuvneshwar");
        Set<Map.Entry<Object,Object>> state=pr.entrySet();
        Iterator<Map.Entry<Object,Object>> itr=state.iterator();
        while(itr.hasNext()) {
            Map.Entry<Object, Object> m=itr.next();
            System.out.println(m.getValue()+" is capital of "+m.getKey());
        }
    }
}



