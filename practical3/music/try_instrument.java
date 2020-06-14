/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.music;
import java.util.Random;
public class try_instrument {
    public static void main(String args[]){
        Instrument[] arr=new Instrument[10];
        Random ra=new Random();
        for(int i=0;i<10;i++)
        {
            int n=ra.nextInt(3)+1;
            switch (n) {
                case 1:
                    arr[i]=new Guitar();
                    break;
                case 2:
                    arr[i]=new Flute();
                    break;
                case 3:
                    arr[i]=new Piano();
                    break;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i] instanceof Piano)
                arr[i].play();
            else if(arr[i] instanceof Guitar)
                arr[i].play();
            else if(arr[i] instanceof Flute)
                arr[i].play();
            else
                System.out.println("Try again...");
        }
    }
}
