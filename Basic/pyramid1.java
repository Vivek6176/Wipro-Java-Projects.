import java.util.*;
public class pyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num=1;
        for(int i=0;i<a;i++){
            int ax = num;
            int l = (i*2)+1;
            for(int j=0;j<l/2;j++){
                System.out.print((ax)%10);
                ax++;
            }
            num = ax+1;
            System.out.print((ax)%10);
            for(int j=0;j<l/2;j++){
                ax--;
                System.out.print((ax)%10);
            }
            System.out.println("");
        }
        sc.close();
    }
}
