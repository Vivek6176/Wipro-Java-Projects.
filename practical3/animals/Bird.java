/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.animals;

/**
 *
 * @author Dell
 */
public class Bird extends Animal {
    @Override
    void eat()
    {
        System.out.println("Bird is eating...");
    }
    @Override
    void sleep()
    {
        System.out.println("Bird is sleeping...");
    }
    void fly()
    {
        System.out.println("Bird is flying...");
    }
}
