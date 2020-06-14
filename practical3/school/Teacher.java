/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.school;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Teacher extends Person {
    double salary;
    String subject;

    public Teacher(String name, String dob, double sal,String sub) {
        super(name, dob);
        this.salary=sal;
        this.subject=sub;
    }
    @Override
    void info()
    {
        System.out.println("Teacher's name is "+super.name+" ,date of birth is "+super.dateofbirth+" ,salary is "+salary+" and subject is "+subject);
    }
}
