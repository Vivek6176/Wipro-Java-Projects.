//Palindrome by rearranging or removing characters
package Project8;
import java.util.*;
public class Palindrome_generator {
    public static void main(String ar[])
    {
        Map<Character,Integer> mp=new HashMap();
        System.out.print("Enter a string:  ");
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        char arr[]=x.toCharArray();
        for(int i=0;i<x.length();i++)
        {
            if(mp.containsKey(arr[i]))
                mp.put(arr[i],mp.get(arr[i])+1);
            else
                mp.put(arr[i],1);
        }
        Set<Character> keySet=mp.keySet();
        Iterator it=keySet.iterator();
        String st="", en="";
        Set<Character> mid=new HashSet<>();
        while(it.hasNext())
        {
            char u=(char) it.next();
            if(mp.get(u)>1)
            {
                Set<Map.Entry<Character,Integer>> set=mp.entrySet();
                Iterator<Map.Entry<Character,Integer>> itr=set.iterator();
                while(itr.hasNext()) {
                    Map.Entry<Character,Integer> e=itr.next();
                    while (e.getValue()>1 && e.getKey().equals(u))
                    {
                        st+=e.getKey();
                        en=e.getKey()+en;
                        mp.put(u,e.getValue()-2);
                    }
                }
            }
            else if(mp.get(u).equals(1))
                mid.add(u);
        }
        if(mid.size()>1){
            Iterator ixr=mid.iterator();
            System.out.println("Largest palindrome that can be generated using given string can any of following "+mid.size()+" strings:");
            while(ixr.hasNext())
                System.out.println("\t"+(st+ixr.next()+en).trim());
        }
        else if(mid.size()==1)
            System.out.println("Largest palindrome that can be generated using given string is: "+(st+mid.toArray()[0]+en).trim());
        else
            System.out.println("Largest palindrome that can be generated using given string is: "+(st+en).trim());
    }
}
