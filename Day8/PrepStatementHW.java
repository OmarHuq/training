package training.com.omar.Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepStatementHW {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8","root", "root");
			
			PreparedStatement inPmst = conn.prepareStatement("INSERT INTO day8.student values (4, 'Shah')");
			inPmst.executeUpdate();		
			
			PreparedStatement pstmt = conn.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
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
