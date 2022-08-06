package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;



public class OracleDAO implements DAO, Search {

HashMap<String, AnimalVO> zoo;
	
	public OracleDAO() {
		zoo = new HashMap<String, AnimalVO>();
	}
	@Override
	public void create(AnimalVO a) {
		String key = a.getId();
		zoo.put(key, a);

	}

	@Override
	public void delete(String id) {
		zoo.remove(id);
	}

	@Override
	public void update(AnimalVO a) {
		String key = a.getId();
		zoo.put(key, a);
	}

	@Override
	public AnimalVO read(String id) {
		AnimalVO a = null;
		a = zoo.get(id);
		return a;
	}

	@Override
	public ArrayList<AnimalVO> select() {
		Collection<AnimalVO> col = zoo.values();
		Iterator<AnimalVO> it = col.iterator();
		
		ArrayList<AnimalVO> list = new ArrayList<>();
		while(it.hasNext()) {
			AnimalVO ani = it.next();
			list.add(ani);			
		}		
		return list;
	}
	@Override
	public ArrayList<AnimalVO> search(String spices) {
		ArrayList<AnimalVO> list = new ArrayList<AnimalVO>();
		
		Collection<AnimalVO> col = zoo.values();
		Iterator<AnimalVO> it = col.iterator();
		
		while(it.hasNext()) {
			AnimalVO anim = it.next();
			if(anim.getSpecies().equals(spices)) {
				list.add(anim);	
			}			
		}
		return list;
	}

}
