/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.school;
import java.text.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class test_school {
    public static void main(String args[])
    {
        Person p1=new Person("Albus Percival Wulfric Brian Dumbledore","1881-08-25");
        Teacher p2=new Teacher("Minerva McGongall","1921-10-04",5230,"Transfiguration");
        Teacher p3=new Teacher("Severus Snape","1960-01-09",4212,"Potions");
        Student p4=new Student("Harry Potter","1980-07-31",1);
        College_student p5=new College_student("Hermione Granger","1979-09-19",2,"Hogwarts","Sixth");
        p1.info();
        p2.info();
        p3.info();
        p4.info();
        p5.info();
    }
}
