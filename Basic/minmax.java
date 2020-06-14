import java.util.Scanner;
public class minmax {
	public static void main(String[] a){
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
}
