package ws;

import java.util.ArrayList;

public interface DAO {
	public void create(AnimalVO c);
	public void delete(String id);
	public void update(AnimalVO c);
	public AnimalVO read(String id);
	public ArrayList<AnimalVO> select();
}
