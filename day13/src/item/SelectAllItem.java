package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllItem {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ITEM";
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://183.96.200.162:3306/shopdb?serverTimezone=Asia/Seoul";
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// SQL�� �̿��� ��û
		try {
			ps = con.prepareStatement(sql);
			
			// ��û ����� Ȯ��
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id =rs.getInt("id");
				String name =rs.getString("name");
				float price =rs.getFloat("price");
				System.out.println(id+""+name+""+price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}


}
