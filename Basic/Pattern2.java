import java.util.*;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of pattern");	
		int c=0,h=sc.nextInt();
		for(int i=1;i<=h;i++)
		{
			for(int j=i;j<=i;j=j+2)
			{
				System.out.println(j);
			}
			System.out.println();
		}
}
}
