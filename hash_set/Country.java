package hash_set;
import java.util.*;

public class Country {
    static HashSet<String> H1=new HashSet<String>();
    static void saveCountryName(String CountryName)
    {
        H1.add(CountryName);
    }
    static String getCountry(String s)
    {
        if(H1.contains(s))
        return s;
        return null;
    }
    public static void main(String args[])
    {
        saveCountryName("India");
        saveCountryName("Ireland");
        saveCountryName("Canada");
        saveCountryName("Nepal");
        saveCountryName("Norway");
        Iterator itr=H1.iterator();
        System.out.println("\nHashset is---- \n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(getCountry("India"));
        System.out.println(getCountry("USA"));
    }
}
