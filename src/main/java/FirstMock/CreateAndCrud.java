package FirstMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class CreateAndCrud {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","oracle123");
		System.out.println("Connection Established");
		Statement s= c.createStatement();
		s.execute("create database exams");
		System.out.println("Database is Created");
		c.close();
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/exams","root","oracle123");
		Statement s1=c1.createStatement();
		s1.execute("create table BE(sid int primary key, sname varchar(20) unique not null, marks int not null,type varchar(20) not null)");
		System.out.println("Table Created");
		s1.execute("insert into BE values(2101,'operating system', 100,'thoery')");
		s1.execute("insert into BE values(2102,'computer networking', 100,'thoery')");
		s1.execute("insert into BE values(2103,'data structures', 100,'thoery')");
		s1.execute("insert into BE values(2104,'java programming', 50,'lab')");
		s1.execute("insert into BE values(2105,'english', 50,'mcq')");
		System.out.println("Values are inserted");
		ResultSet r1=s1.executeQuery("select * from BE");
		r1.next();
		System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getString(4)+" "); 
		r1.next();
		System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getString(4)+" "); 
		r1.next();
		System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getString(4)+" "); 
		r1.next();
		System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getString(4)+" "); 
		r1.next();
		System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3)+" "+r1.getString(4)+" "); 
		r1.next();
		
		
	}

}
