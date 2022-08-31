package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class AnimalDAO implements DAO {

	HashMap<String, AnimalVO> zoo;
	public AnimalDAO() {
		zoo = new HashMap<String, AnimalVO>();
	}
	
	@Override
	public void insert(AnimalVO a) throws DuplicatedIDException {
		String id = a.getId();
		if(zoo.containsKey(id)) {
			throw new DuplicatedIDException("ID 중복!");
		}
		zoo.put(id, a);

	}

	@Override
	public void delete(String id) throws NotFoundException {
		if(!zoo.containsKey(id)) {
			throw new NotFoundException("id를 찾지 못함");
		}
		zoo.remove(id);
	}

	@Override
	public void update(AnimalVO a) throws NotFoundException {
		String id = a.getId();
		if(!zoo.containsKey(id)) {
			throw new NotFoundException("id를 찾지 못함");
		}
		zoo.put(id, a);
	}

	@Override
	public AnimalVO select(String id) throws NotFoundException {
		if(!zoo.containsKey(id)) {
			throw new NotFoundException("id를 찾지 못함");
		}
		AnimalVO a = zoo.get(id);
		return a;
	}

	@Override
	public ArrayList<AnimalVO> select() throws NotFoundException {
		ArrayList<AnimalVO> list = new ArrayList<AnimalVO>();
		if(zoo.size()==0) {
			throw new NotFoundException("데이터가 존재하지 않음");
		}
		Collection<AnimalVO> col = zoo.values();	
		Iterator<AnimalVO> it = col.iterator();
		
		while(it.hasNext()) {
			AnimalVO anim = it.next();
			list.add(anim);			
		}		
		return list;
	}

}
