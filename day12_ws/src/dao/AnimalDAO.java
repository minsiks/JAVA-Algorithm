package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import frame.DAO;
import vo.AnimalVO;

public class AnimalDAO implements DAO<String, AnimalVO> {

	HashMap<String, AnimalVO> zoo;

	public AnimalDAO() {
		zoo = new HashMap<String, AnimalVO>();
	}

	@Override
	public void insert(AnimalVO v) throws Exception {
		String id = v.getId();
		if(zoo.containsKey(id)) {
			throw new Exception("id �ߺ�");
		}
		zoo.put(id, v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!zoo.containsKey(k)) {
			throw new Exception("id�� �����ϴ�.");
		}
		zoo.remove(k);
	}

	@Override
	public void update(AnimalVO v) throws Exception {
		String id = v.getId();
		if(!zoo.containsKey(id)) {
			throw new Exception("id�� �����ϴ�.");
		}
		zoo.put(id, v);
	}

	@Override
	public AnimalVO select(String k) throws Exception {
		AnimalVO a = null;
		if(!zoo.containsKey(k)) {
			throw new Exception("id�� �����ϴ�.");
		}
		a = zoo.get(k);
		return a;
	}

	@Override
	public ArrayList<AnimalVO> select() throws Exception {
		ArrayList<AnimalVO> list = new ArrayList<AnimalVO>();
		
		if(zoo.size()==0) {
			throw new Exception("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		
		Collection<AnimalVO> col = zoo.values();	
		Iterator<AnimalVO> it = col.iterator();
		
		while(it.hasNext()) {
			AnimalVO ani = it.next();
			list.add(ani);			
		}		
		return list;
	}


	

}
