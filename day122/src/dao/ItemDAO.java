package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.ItemVO;

public class ItemDAO implements DAO<Integer, ItemVO> {

	HashMap<Integer, ItemVO> map;
	
	public ItemDAO() {
		map = new HashMap<Integer, ItemVO>();
	}
	
	@Override
	public void insert(ItemVO v) throws Exception {
		int id = v.getId();
		if(map.containsKey(id)) {
			throw new Exception("id �ߺ�");
		}
		map.put(id, v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("id�� �����ϴ�.");
		}
		
	}

	@Override
	public void update(ItemVO v) throws Exception {
		int id = v.getId();
		if(!map.containsKey(id)) {
			throw new Exception("id�� �����ϴ�.");
		}
		map.put(id, v);		
	}

	@Override
	public ItemVO select(Integer k) throws Exception {
		ItemVO c = null;
		if(!map.containsKey(k)) {
			throw new Exception("id�� �����ϴ�.");
		}
		c = map.get(k);
		return c;
	}

	@Override
	public List<ItemVO> select() throws Exception {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		
		if(map.size()==0) {
			throw new Exception("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		
		Collection<ItemVO> col = map.values();	
		Iterator<ItemVO> it = col.iterator();
		
		while(it.hasNext()) {
			ItemVO item = it.next();
			list.add(item);			
		}		
		return list;
	}

}
