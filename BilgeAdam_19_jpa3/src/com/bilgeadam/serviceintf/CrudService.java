package com.bilgeadam.serviceintf;

import java.util.List;

public interface CrudService<T> {

	public List<T> findAll();
	public T findbyId(int id);
	public void persistToDatabase(T object);
	public void deleteFromDatabase(T object);
	public void updateAtDatabase(T object);
	public boolean existsAtDatabase(T object);
	void deleteFromDatabase(int id);
	
	
}
