/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.shapes;

/**
 *
 * @author Dell
 */
public class Square extends Shape{
    @Override
    void draw()
    {
        System.out.println("Drawing Square...");    
    }
    @Override
    void erase()
    {
        System.out.println("Erasing Square...");
    }    
}
