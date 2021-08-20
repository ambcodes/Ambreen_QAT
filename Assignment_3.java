package com.AssignmentDay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Assignment_3 {
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username ="SYSTEM";
		String password = "pinksan";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String updateQuery ="UPDATE TABLE_02 SET ID_B = 100  WHERE ID_B = 3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM TABLE_02");
		System.out.println("Query Execution"+rs);
		
		while(rs.next()){
			System.out.println(rs.getString("ID_B")+" - "+rs.getString("CITY")+" - "+rs.getString("NAME"));
		}
		con.close();
		
	}

}