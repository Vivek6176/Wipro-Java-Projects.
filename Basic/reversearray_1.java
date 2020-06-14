import java.util.Scanner;
public class reversearray_1 {
public static void main(String[] a)
{
	Scanner s=new Scanner(System.in);
	int k=0,m=0,sum=0,n=s.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
            arr1[i]=s.nextInt();
	int j,i=n-1;
	int ar2[]= new int[n];
	for(j=0;j<n;j++,i--)
            ar2[j]=arr1[i];
	for(i=0;i<n;i++)
            System.out.print(ar2[i]+"  ");
}
}
