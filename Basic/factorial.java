import java.util.*;
public class factorial {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),fact=1;
	for(int i=n;i>1;i--)
	{
		fact=fact*i;
	}
	System.out.println("Factorial is "+fact);
}
}
