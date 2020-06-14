package database;
import java.util.*;
import java.sql.*;
public class employeedatabase {
    static int emp_id,age;
    static String name,desig,gender;
    static Scanner sc=new Scanner(System.in);
    static void check() {
        try{
            Connection con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/java", "root", "Vicky2000");
            Statement st=con.createStatement();
            System.out.println("Enter employee ID:  ");
            emp_id=sc.nextInt();
            String query="select*from employee where Emp_id="+emp_id+";";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("Emp ID\t\t"+rs.getString("Emp_id"));
                System.out.println("Name\t\t"+rs.getString("Name"));
                System.out.println("Designation\t"+rs.getString("desi"));
                System.out.println("Gender\t\t"+rs.getString("gender"));
                System.out.println("Age\t\t"+rs.getString("age"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void displayall()
    {
        try{
            Connection con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/java", "root", "Vicky2000");
            Statement st=con.createStatement();
            String query="select*from employee";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("Emp ID\t\t"+rs.getString("Emp_id"));
                System.out.println("Name\t\t"+rs.getString("Name"));
                System.out.println("Designation\t"+rs.getString("desi"));
                System.out.println("Gender\t\t"+rs.getString("gender"));
                System.out.println("Age\t\t"+rs.getString("age"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void delete() {
        try{
            Connection con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/java", "root", "Vicky2000");
            Statement st=con.createStatement();
            System.out.println("Enter employee ID to delete:  ");
            emp_id=sc.nextInt();
            String query="delete from employee where Emp_id="+emp_id+";";
            st.execute(query);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void update() {
        try{
            Connection con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/java", "root", "Vicky2000");
            Statement st=con.createStatement();
            System.out.println("Enter employee ID:  ");
            emp_id=sc.nextInt();
            String query="insert into employee values('"+emp_id+"','"+name+"','"+desig+"','"+gender+"',"+age+");";
            st.execute(query);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void insert()
    {
        try{
            Connection con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/java", "root", "Vicky2000");
            Statement st=con.createStatement();
            System.out.println("Enter employee ID:  ");
            emp_id=sc.nextInt();
            System.out.println("Enter employee name:  ");
            name=sc.next();
            System.out.println("Enter employee designation:  ");
            desig = sc.next();
            System.out.println("Enter gender:  ");
            gender=sc.next();
            System.out.println("Enter age:  ");
            age=sc.nextInt();
            String query="insert into employee values('"+emp_id+"','"+name+"','"+desig+"','"+gender+"',"+age+");";
            st.execute(query);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        System.out.println("Please select: \n1. Add new Employee\n2. Check details\n3. Delete employee details\n4. Update details\n5. Display all\n6. Exit");
        int n=sc.nextInt();
        switch(n)
        {
            case 1: insert();
                break;
            case 2: check();
                break;
            case 3: delete();
                break;
            case 4: update();
                break;
            case 5: displayall();
                break;
            case 6: System.exit(0);
                break;
            default: 
                System.out.println("Wrong input...");
        }
    }
}
