import java.util.*;
public class assignment {
public static void main(String args[])
{
	/*int Rh=6,Kh=5,Rp=32,Kp=40;
	double Re=Rp/Rh;
	double Ke=Kp/Kh;
	double e=Re+Ke;
	System.out.println(110/e);
	int ar1[]={1,2,3,4,5,6};
	int j,n=ar1.length,i=n-1;
	int ar2[]= new int[n];
	for(j=0;j<n;j++,i--)
	{
		ar2[j]=ar1[i];
	}
	for(i=0;i<n;i++)
	{
		System.out.println(ar2[i]+"  ");
	}*/
	/*/
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
	System.out.print(sum);
	*/
	Scanner sc = new Scanner(System.in);
	int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i < n; i++){
		arr[i] = sc.nextInt();
		if(arr[i] > max)
			max = arr[i];
		if(arr[i] < min)
            min = arr[i];
		}
	System.out.println("Min: " + min + "\nMax: " + max);
	sc.close();
	}
/*
	 Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     char [] list = str.toCharArray();
     ArrayList update = new ArrayList();
     boolean chk = false;
     for(int i = 0; i < list.length; i++){
         chk = update.contains(list[i]);
         if(chk == false){
             update.add(list[i]);
             System.out.print(list[i]);
         }
     }
     sc.close();
     */
}

