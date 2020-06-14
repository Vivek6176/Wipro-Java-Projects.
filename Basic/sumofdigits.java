import java.util.Scanner;
public class sumofdigits {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),sum=0;
	for(int i=n;i>0;i=i/10)
	{
		sum=sum+(i%10);
		//System.out.println(sum);
	}
	System.out.println(sum);
}
}
