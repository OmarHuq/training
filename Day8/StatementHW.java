package training.com.omar.Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementHW {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8","root", "root");
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into day8.student values (3, 'Bob');");
			stmt.executeUpdate("UPDATE `day8`.`student` SET `StudName` = 'Omar' WHERE (`StudID` = '1');");
		//	stmt.executeUpdate("DELETE FROM `day8`.`student` WHERE (`StudID` = '3');");
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2));
			}
		}
		
		catch(SQLException e){
			e.printStackTrace();
			
		} finally {
			
			try {
				if (conn!=null) {
					conn.close();
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
