/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.*;
public class Employee {

public static void main(String[] args) {
   int z=0;
   String dc="";
   int r=0;
   boolean flag=false;
String [][]empd={{"EmpNo","EmpName","JoinDate","DesigCode","Dept","Basic","HRA","IT"},
                {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
                {"1003","Rahul","12/11/2008","k","Acct","10000","8000","10000"},
                {"1004","Chahat","29/01/2013","r","FrontDesk","12000","6000","2000"},
                {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
                {"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
                {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
String [][]dd={{"DesigCode","Designation","DA"},
              {"e","engineer","20000"},
              {"c","consultant","32000"},
              {"k","clerk","12000"},
              {"r","Receptionist","15000"}};
System.out.println("Enter the employee id:");
Scanner sc = new Scanner(System.in);
String e,id=sc.nextLine();
for(int i=0;i<8;i++)
   {
       if(empd[i][0].equals(id))
       {
           r=i;
           dc=empd[i][3];
           flag=true;
           break;
       }
       else
          flag=false;
    }
if(flag==false)
{
    System.out.println("No such record found!");
    System.exit(0);
}
for(int j=0;j<3;j++)
{
    if(dc.equals(dd[j][0]))
    {
        z=Integer.parseInt(dd[j][2]);
    }
}
int sal=Integer.parseInt(empd[r][5])+Integer.parseInt(empd[r][6])+z-Integer.parseInt(empd[r][7]);
System.out.println("SALARY:" +sal);      
}
}