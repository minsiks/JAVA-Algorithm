package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertItem {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		
		// 변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO ITEM VALUES (?,?,?)";
		
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
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 0113);
			ps.setString(2, "젓가락");
			ps.setFloat(3, 1200);
		// 요청 결과를 확인
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close
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
