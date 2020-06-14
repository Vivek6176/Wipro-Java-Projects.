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
public class Student extends Person {
    int studentid;
    public Student(String name, String dob, int id) {
        super(name, dob);
        this.studentid=id;
    }
    @Override
    void info()
    {
        System.out.println("Student name is "+super.name+" ,date of birth is "+super.dateofbirth+" and student id is "+studentid);
    }
}
