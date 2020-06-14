/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test extends Accounts{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter yout choice");
        System.out.println("1.Interest calculator-SB");
        System.out.println("2.Interest calculator-FD");
        System.out.println("3.Interest calculator-RD");
        int ans=s.nextInt();
        switch(ans){
            case 1: System.out.println("enter the average amount");
                    double amount=s.nextDouble();
                    System.out.println("Enter the type of AC");
                    String type=s.next();
                    SBAccount obj1=new SBAccount(amount,type);
                    System.out.println(obj1.calculateInterest());
                    break;
            case 2: System.out.println("Enter the FD amount");
                    double amount1=s.nextDouble();
                    System.out.println("Enter the number of days");
                    int noofDays=s.nextInt();
                    System.out.println("Enter your age");
                    int age=s.nextInt();
                    FDAccount obj2=new FDAccount(amount1,noofDays,age);
                    System.out.println(obj2.calculateInterest());
                    break;
            case 3: System.out.println("enter the amount");
                    double amount2=s.nextDouble();
                    System.out.println("Enter the no of Months");
                    int noOfMonth=s.nextInt();
                    System.out.println("enter the age");
                    int age2=s.nextInt();
                    RDAccounts obj3=new  RDAccounts(amount2,noOfMonth,age2);
                    System.out.println(obj3.calculateInterest());
                    break;
            default:
                    System.out.println("Enter valid choice");
                    break;
        }
    }
    @Override
    double calculateInterest() {
        return 0;
    }
}
