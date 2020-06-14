/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_serialization;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class objser {
    public static void main(String args[])
    {
        String data="Harry Potter";
        try
        {
            FileOutputStream fos=new FileOutputStream("abc.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(data);
            byte[] x= data.getBytes();
            fos.write(x);
            fos.close();
            System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
