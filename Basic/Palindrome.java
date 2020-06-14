import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		String m="";
		char[] q=n.toCharArray();
		for(int i=q.length-1;i>=0;i--)
			m+=q[i];
		//System.out.println(m);
		if(m.equals(n))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
}}
