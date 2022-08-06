package oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerDAO implements DAO {

	HashMap<String, CustomerVO> map;
	
	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>(); 
	}
	
	@Override
	public void insert(CustomerVO c) throws DuplicatedIDException {
		String id = c.getId();
		if(map.containsKey(id)) {
			throw new DuplicatedIDException("ID �ߺ� !");
		}
		map.put(id, c);
	}

	@Override
	public void delete(String id) throws NotFoundException {
		if(!map.containsKey(id)){
			throw new NotFoundException("ID�� ã�� ���Ͽ����ϴ�.");
		} 
		map.remove(id); 
		
	}

	@Override
	public void update(CustomerVO c) throws NotFoundException {
		String id = c.getId();
		if(!map.containsKey(id)){			
			throw new NotFoundException("ID�� ã�� ���Ͽ����ϴ�.");
		} 
		map.put(id, c);
	}

	@Override
	public CustomerVO select(String id) throws NotFoundException {
		if(!map.containsKey(id)){
			throw new NotFoundException("ID�� ã�� ���Ͽ����ϴ�.");
		} 
		CustomerVO c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {		
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if(map.size()==0) {
			throw new NotFoundException("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		
		Collection<CustomerVO> col = map.values();	
		Iterator<CustomerVO> it = col.iterator();
		
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);			
		}		
		return list;
	}

}
