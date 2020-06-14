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
public class College_student extends Student {
    String college;
    String year;

    public College_student(String name, String dob, int id, String clg, String year) {
        super(name, dob, id);
        this.college=clg;
        this.year=year;
    }
    @Override
    void info()
    {
        System.out.println("Student name is "+super.name+" ,date of birth is "+super.dateofbirth+" ,student id is "+super.studentid+" ,college is "+college+" and year is "+year);
    }
}
