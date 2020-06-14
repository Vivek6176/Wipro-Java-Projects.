/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Dell
 */
public class Class1 {
     public Class1()
     {
         System.out.println("Yes");
     }
    class Class2{
    void pr()
    {
         System.out.println("YOOO");
    }
    }
}
class Class3 extends Class1{
    public Class3()
    {
         System.out.println("No");
    }
}
class C{
    public static void main(String a[])
    {
        Class3 x=new Class3();
    }
}
