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
public class CheckShapes {
    public static void main(String args[])
    {
        Shape S=new Shape();
        Circle c=new Circle();
        Square s=new Square();
        Triangle t=new Triangle();
        S.draw();
        S.erase();
        c.draw();
        c.erase();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
    }
}
