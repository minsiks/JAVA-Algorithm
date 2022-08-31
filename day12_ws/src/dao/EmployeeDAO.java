package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import frame.DAO;
import vo.EmployeeVO;

public class EmployeeDAO implements DAO<Integer, EmployeeVO> {

	HashMap<Integer, EmployeeVO> zoo;
	
	public EmployeeDAO() {
		zoo = new HashMap<Integer, EmployeeVO>();
	}
	
	@Override
	public void insert(EmployeeVO v) throws Exception {
		int id = v.getId();
		if(zoo.containsKey(id)) {
			throw new Exception("ID 중복");
		}
		zoo.put(id, v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!zoo.containsKey(k)) {
			throw new Exception("ID가 없음");
		}
		zoo.remove(k);
	}

	@Override
	public void update(EmployeeVO v) throws Exception {
		int id = v.getId();
		if(!zoo.containsKey(id)) {
			throw new Exception("ID가 없음");
		}
		zoo.put(id, v);		
	}

	@Override
	public EmployeeVO select(Integer k) throws Exception {
		EmployeeVO e = null;
		if(!zoo.containsKey(k)) {
			throw new Exception("ID가 없음");
		}
		e = zoo.get(k);
		return e;
	}

	@Override
	public ArrayList<EmployeeVO> select() throws Exception {
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		if(zoo.size()==0) {
			throw new Exception("데이터가 존재하지 않습니다.");
		}
		
		Collection<EmployeeVO> col = zoo.values();	
		Iterator<EmployeeVO> it = col.iterator();
		
		while(it.hasNext()) {
			EmployeeVO emp = it.next();
			list.add(emp);			
		}		
		return list;
	}

}
