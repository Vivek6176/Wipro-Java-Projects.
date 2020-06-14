package Project8;
import java.util.*;
public class Palindrome_generator_2 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String in=sc.next();
        int len=in.length(); 
        int n=2*len+1;
        int[] low=new int[n+1]; 
        low[0]=0; 
        low[1]=1; 
        int C=1, R=2, i=0, j, mL=0, mx=0, start=-1, end=-1, diff=-1; 
        for(i= 2;i<n;i++)  
        { 
            j=2*C-i; 
            low[i]=0; 
            diff =R-i; 
            if(diff>0) 
                low[i]=Math.min(low[j],diff); 
            while(((i+low[i])+1<n && (i-low[i])>0) && (((i+low[i]+1)%2==0) || (in.charAt((i+low[i]+1)/2)==in.charAt((i-low[i]-1)/2))))  
                low[i]++; 
            if(low[i]>mL) 
            { 
                mL=low[i]; 
                mx=i; 
            } 
            if(i+low[i]>R)  
            { 
                C=i; 
                R=i+low[i]; 
            } 
        } 
        start=(mx- mL)/2; 
        end=start+mL-1; 
        System.out.print("Longest palindrome substring is : "); 
        for(i=start;i<=end;i++) 
            System.out.print(in.charAt(i)); 
        System.out.println(); 
    }
}
//ASANTALIVEDASADEVILATNASA