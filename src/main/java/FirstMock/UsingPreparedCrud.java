package FirstMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class UsingPreparedCrud {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/exams","root","oracle123");
		/*
		 * PreparedStatement p=c.prepareStatement("insert into BE values(?,?,?,?)");
		 * System.out.println("Enter the sid"); int i=sc.nextInt(); p.setInt(1, i);
		 * 
		 * System.out.println("Enter the sname"); String n=sc.next(); p.setString(2, n);
		 * 
		 * System.out.println("Enter the marks"); int m=sc.nextInt(); p.setInt(3,m);
		 * 
		 * System.out.println("Enter the type"); String s=sc.next(); p.setString(4, s);
		 * p.execute();
		 */
		/*
		 * PreparedStatement
		 * p1=c.prepareStatement("update BE set sname=?,marks=?,type=? where sid=2107");
		 * System.out.println("Enter the name"); String nn=sc.nextLine();
		 * p1.setString(1, nn);
		 * 
		 * System.out.println("Enter the marks"); int pp=sc.nextInt(); p1.setInt(2,pp);
		 */
			PreparedStatement p1=c.prepareStatement("Delete from BE where sid in(?)");
			System.out.println("Enter the sid: ");
			int i1=sc.nextInt();
			p1.setInt(1, i1);
			 
			p1.execute();
			System.out.println("Values are Deleted");
			p1.executeLargeUpdate();

	}

}
