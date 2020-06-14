import java.util.*;
public class duplicate {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String a=s.next(),b="";
	char[] c1=a.toCharArray();
	int ar[]=new int[98];
	for(int i=0;i<a.length();i++)
	{
		if(ar[c1[i]-' ']!=1)
		{
			b+=c1[i];
			ar[c1[i]-' ']=1;
		}
	}
	System.out.print(b);
}
}
