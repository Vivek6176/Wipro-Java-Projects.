/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;
public class EmployeeDB {
    ArrayList<Employee> list=new ArrayList();
    boolean addemployee(Employee e)
    {
        if(list.add(e))
            return true;
        return false;
    }
    boolean deleteemployee(int id)
    {
        for(int i=0;i<list.size();i++)
        {
            Employee obj=list.get(i);
            if(obj.empid==id)
                list.remove(i);
            return true;
        }
        return false;
    }
    String showpayslip(int id)
    {
        for(int i=0;i<list.size();i++)
        {
            Employee obj=list.get(i);
            if(obj.empid==id)
                return "EmpId is "+obj.empid+" and salary is "+obj.salary;
        }
        return "No results";
    }
}
