package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.EmployeeVO;

public class EmployeeDao extends Dao<Integer, EmployeeVO> {

	@Override
	public void insert(EmployeeVO v) throws Exception {
		// Connection
				Connection con = null;
				PreparedStatement ps = null;
				try {
					con = getConnection();	
					ps = con.prepareStatement(Sql.insertEmployee);
					ps.setInt(1, v.getId());
					ps.setString(2, v.getName());
					ps.setString(3, v.getCaringAnimal());
					ps.executeUpdate();
				}catch(Exception e) {
					throw new Exception("ID 중복");
				}finally {
					close(ps);
					close(con);
				}
		
	}

	@Override
	public void update(EmployeeVO v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateEmployee);
			ps.setString(1, v.getName());
			ps.setString(2, v.getCaringAnimal());
			ps.setInt(3, v.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("입력 오류");
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void delete(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteEmployee);
			ps.setInt(1, k);
			int result = ps.executeUpdate();
			if(result != 1) {
				throw new Exception("삭제 항목이 없습니다.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public EmployeeVO select(Integer k) throws Exception {
		EmployeeVO emp = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectEmployee);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String caringanimal = rs.getString("caringanimal");
			emp = new EmployeeVO(id,name,caringanimal);			
		} catch (Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		return emp;
	}

	@Override
	public List<EmployeeVO> select() throws Exception {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllEmployee);
			rs = ps.executeQuery();			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String caringanimal = rs.getString("caringanimal");
				EmployeeVO emp = new EmployeeVO(id,name,caringanimal);	
				list.add(emp);
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		
		return list;
	}

}
