/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.fruits;

/**
 *
 * @author Dell
 */
public class test_fruits {
    public static void main(String args[])
    {
        Orange o=new Orange();
        Apple a=new Apple();
        Fruit f=new Fruit("Mango","Sweet");
        o.eat();
        a.eat();
        f.eat();
    }
}
