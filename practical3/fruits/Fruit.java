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
public class Fruit {
    String name, taste, size;
    public Fruit(){}
    public Fruit(String name, String taste)
    {
       this.name=name;
       this.taste=taste;
    }
    public void eat()
    {
        System.out.println("Fruit name is " +name+ " and taste is "+ taste );
    }
}
