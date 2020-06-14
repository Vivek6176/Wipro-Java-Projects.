/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Dell
 */
public class Check_Employee {
    public static void main(String args[])
    {
        EmployeeDB arr=new EmployeeDB();
        Employee o=new Employee(2861,"Vivek","2861@mail.com","Male",16501);
        System.out.println("Adding successful ? -"+arr.addemployee(o));
        o.getemployeedetails();
        System.out.println(arr.showpayslip(2861));
        System.out.println("Deletion successful? -"+arr.deleteemployee(2861));
    }
}
