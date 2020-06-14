import java.util.*;
import java.util.AbstractList;
public class duplicatearrayrem {
public static void main(String a[])
{
	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char [] list = str.toCharArray();
    ArrayList update = new ArrayList();
    boolean chk = false;
    for(int i = 0; i < list.length; i++){
        chk = update.contains(list[i]);
        if(chk == false){
            update.add(list[i]);
            System.out.print(list[i]);
        }
    }
    sc.close();
}
}
