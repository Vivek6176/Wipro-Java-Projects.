import java.util.*;
public class SameRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n1=43,n2=91,n3=183;
		int temp,min;
		temp=(n1<n2)?n1:n2;
		min=(n3<temp)?n3:temp;
		//System.out.println(min);
		for(int i=min;i>=2;i--)
		{
			if(n1%i==n2%i && n1%i==n3%i)
			{
				System.out.println(i);
				break;
			}
		}
	}}
