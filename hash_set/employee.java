
package hash_set;
import java.util.*;
public class employee {
    public static void main(String args[])
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Vivek");
        hs.add("Shristi");
        hs.add("Ashish");
        hs.add("Bharat");
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
