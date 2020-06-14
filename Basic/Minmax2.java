
import java.util.Scanner;

public class Minmax2 {
    	public static void main(String[] a){
	Scanner sc = new Scanner(System.in);
        int max1,max2,min1,min2;
	max1=max2=Integer.MIN_VALUE;
        min1=min2=Integer.MAX_VALUE;
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1)  
                max2= arr[i];  
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1)  
                min2= arr[i];  
	}
	System.out.println("Min 1: "+min1 +"\nMax 1: "+max1);
        System.out.println("Min 2: "+min2 +"\nMax 2: "+max2);
	sc.close();
	}
}
