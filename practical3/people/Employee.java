/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.people;

/**
 *
 * @author Dell
 */
public class Employee extends Person {
    double salary;
    String year,Insurance_no;
    public Employee(String name, double sal, String year, String in) {
        super(name);
        this.salary=sal;
        this.year=year;
        this.Insurance_no=in;
    }
    void info()
    {
        System.out.println("Employee Name is "+super.name+" ,year of joining is "+year+" ,salary is "+salary+" and insurance no. is "+Insurance_no);
    }
}
