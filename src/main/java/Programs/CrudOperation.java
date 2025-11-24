package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Get Connection 
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","oracle123");
		System.out.println("Connection Established");
		Statement s1= c1.createStatement();
		//s1.execute("insert into cricket values(201801,'VIRAT KOHLI',28000)");
		//s1.execute("insert into cricket values(201802,'STEIVE SMITH',19000)");
		//s1.execute("insert into cricket values(201803,'KANE WILLIAMSON',16000)");
		//s1.execute("insert into cricket values(201804,'JOE ROOT',20000)");
		//s1.execute("insert into cricket values(201805,'ROHIT SHARMA',17000)");
		//s1.execute("insert into cricket values(201806,'KL RAHUL',10000)");
		//System.out.println("Values are inserted");
		//update values
		//s1.execute("update cricket set name='CHETHESHWAR PUJARA',runs=17000 where iccrank=201805");
		//System.out.println("Value is updated");
		//delete the row
		//s1.execute("delete from cricket where iccrank in (1,2,3,4,5,6)");
		/*
		 * ResultSet r=s1.executeQuery("Select * from cricket"); r.next();
		 * System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)); r.next();
		 * System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)); r.next();
		 * System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)); r.next();
		 * System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)); r.next();
		 * System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)); r.next();
		 */
		// System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
		   ResultSet r1=s1.executeQuery("Select iccrank,name,runs from cricket ");
		/*
		 * r1.next(); System.out.println(r1.getString(1)+" "+r1.getInt(2)); r1.next();
		 * System.out.println(r1.getString(1)+" "+r1.getInt(2)); r1.next();
		 * System.out.println(r1.getString(1)+" "+r1.getInt(2)); r1.next();
		 * System.out.println(r1.getString(1)+" "+r1.getInt(2)); r1.next();
		 * System.out.println(r1.getString(1)+" "+r1.getInt(2)); r1.next();
		 * System.out.println(r1.getString(1)+" "+r1.getInt(2));
		 */
		while(r1.next()) {
			System.out.println(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getInt(3));
			//Delete the values from table
			//ResultSet r2= s1.execute("delete from cricket");
			//System.out.println("Rows are deleted");
		}
		
		
	}

}
