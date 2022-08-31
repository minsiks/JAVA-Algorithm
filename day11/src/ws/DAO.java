package ws;

import java.util.ArrayList;

public interface DAO {
	public void insert(AnimalVO a) throws DuplicatedIDException;
	public void delete(String id)  throws NotFoundException;
	public void update(AnimalVO a) throws NotFoundException;
	public AnimalVO select(String id) throws NotFoundException;
	public ArrayList<AnimalVO> select() throws NotFoundException;
}
