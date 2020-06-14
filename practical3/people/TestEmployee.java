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
public class TestEmployee {
    public static void main(String args[])
    {
        Employee e1=new Employee("Severus Snape",2512,"1980","H00-APWBD-P-HS-SLH");
        Employee e2=new Employee("Minerva McGongall",4275,"1954","H54-AD-T-APWBD-GRH");
        e1.info();
        e2.info();
    }
}
