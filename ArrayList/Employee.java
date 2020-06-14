/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
public class Employee {
    int empid;
    String empname, email, gender;
    float salary;
    public Employee(int id, String name, String email, String sex, float sal)
    {
        this.empid=id;
        this.empname=name;
        this.email=email;
        this.gender=sex;
        this.salary=sal;
    }
    void getemployeedetails()
    {
        System.out.println("Employee Id is "+empid+" ,employee name is "+empname+" ,email id is "+email+" ,gender is "+gender+" and salary is "+salary);
    }
}
