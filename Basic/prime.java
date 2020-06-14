import java.util.*;
public class prime {
public static void main(String a[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),c=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i!=0)
		c=1;
	}
	if(c==1)
		System.out.print("No. is not prime.");
	else
		System.out.print("No. is prime.");
}
}
