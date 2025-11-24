package FirstMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAndDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/exams","root","oracle123");
		Statement s1=c.createStatement();
		s1.execute("update BE set sname='dsa',type='lab' where sid=2103 ");
		//value is updated
		s1.execute("insert into BE values(2106,'kannada', 50,'mcq')");
		s1.execute("delete from BE where sid=2105");
		//values are deleted
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
