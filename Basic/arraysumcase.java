import java.util.*;
public class arraysumcase {
public static void main(String[] a)
{
	Scanner s=new Scanner(System.in);
	int k=0,m=0,sum=0,n=s.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr1[i]=s.nextInt();
		if(arr1[i]==6)
			m=1;
		if(k==1 || m==0)
			sum+=arr1[i];
		if(arr1[i]==7)
			k=1;
	}
	System.out.println(sum);
}
}
