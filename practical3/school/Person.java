/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.school;

/**
 *
 * @author Dell
 */
public class Person {
    String name;
    String dateofbirth;
    public Person(String name, String dob)
    {
        this.name=name;
        this.dateofbirth=dob;
    }
    void info()
    {
        System.out.println("Name of person is "+name +" and date of birth is "+dateofbirth);
    }
}
