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
public class Apple extends Fruit{
    @Override
    public void eat()
    {
        super.name="Apple";
        super.taste="Sweet";
        System.out.println("Fruit is "+name+" and taste is "+taste);
    }
}
