import java.util.*;


public class EraseRepeated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> u = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(!u.contains(arr[i])){
                u.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
