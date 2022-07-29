package training.com.omar.Day8;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.CallableStatement;


public class Procedure {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8","root", "root");
			
			CallableStatement cstmt = conn.prepareCall("{call studprocedure(9, 'Josh')}");
			cstmt.execute();
			
			
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
