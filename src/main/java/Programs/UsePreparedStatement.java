package Programs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UsePreparedStatement {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");//register
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/restorent","root","oracle123");//load class
		//PreparedStatement p1=c.prepareStatement("insert into employees values(?,?,?,?,?)");

		/*
		 * System.out.println("Enter the empid"); 
		 * int i=sc.nextInt(); 
		 * p1.setInt(1, i);
		 * 
		 * System.out.println("Enter the name"); 
		 * String n=sc.next(); 
		 * p1.setString(2, n);
		 * 
		 * System.out.println("Enter the Phone"); 
		 * long p=sc.nextLong(); 
		 * p1.setLong(3,p);
		 * 
		 * System.out.println("Enter the salary"); 
		 * int s=sc.nextInt(); 
		 * p1.setInt(4, s);
		 * 
		 * System.out.println("Enter the Job"); 
		 * String j=sc.next(); 
		 * p1.setString(5, j);
		 * 
		 * p1.execute();
		 * System.out.println("Inserted the values");
		 */


		//update
		/*
		 * PreparedStatement p1=c.prepareStatement("update employees set ename=?,phone=?,sal=? where empid=1007");
		 * System.out.println("Enter the name"); 
		 * String nn=sc.nextLine();
		 * p1.setString(1, nn);
		 * 
		 * System.out.println("Enter the phone"); 
		 * String pp=sc.next(); p1.setString(2,pp);
		 * 
		 * System.out.println("Enter the salary"); 
		 * String ss=sc.next(); 
		 * p1.setString(3,ss);
		 * 
		 * p1.executeLargeUpdate();
		 */


		/*
		 * PreparedStatement p1=c.prepareStatement("select * from employees where empid in(?,?,?)");
		 * System.out.println("Enter the empid"); 
		 * int ii=sc.nextInt(); 
		 * p1.setInt(1, ii);
		 * 
		 * System.out.println("Enter the empid"); 
		 * int iii=sc.nextInt(); 
		 * p1.setInt(2,iii);
		 * 
		 * System.out.println("Enter the empid"); 
		 * int iiii=sc.nextInt(); 
		 * p1.setInt(3,iiii);
		 * 
		 * ResultSet r=p1.executeQuery(); 
		 * while(r.next()) {
		 * System.out.println("empid: "+r.getInt(1)+" "+"name: "+r.getString(2)+" " 
		 * +"phone: "+r.getLong(3)+" "+"salary: "+r.getString(4)+" "+"Job: "+r.getString(5)); 
		 * }
		 */


		//Delete
		PreparedStatement p1=c.prepareStatement("Delete from employees where empid in(?)");
		System.out.println("Enter the empid: ");
		int i1=sc.nextInt();
		p1.setInt(1, i1);
		 
		p1.execute();
		System.out.println("Values are Deleted");
		
		
	}

}
