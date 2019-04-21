package com.bilgeadam.dao;

import java.util.List;

public interface CrudRepository<T> {

	List<T> findAll();
	T findById(int id);
	void persistToDB(T t);
	void deleteFromDB(int id);
	void deleteFromDB(T t);
	void updateAtDB(String t);
	boolean isExistsOnDB(T t);
	
}
