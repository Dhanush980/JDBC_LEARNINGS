package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnectionAndCrud {
public static void main(String []args) throws ClassNotFoundException, SQLException {
	//register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Get Connection 
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","oracle123");
	System.out.println("Connection Established");
	//create statement
	Statement s= c.createStatement();
	s.execute("create database student");
	System.out.println("DataBase Is Created");
	c.close();
	Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","oracle123");
	Statement s1=c1.createStatement();
	s1.execute("create table cricket(Iccrank int primary key,name varchar(20) not null,runs bigint(15) not null)");
	System.out.println("Table is Created");
}
}
