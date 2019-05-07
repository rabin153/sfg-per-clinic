package springuru.springguru.service;

import java.util.Set;

// Type of object and Id
// using java generics
public interface CrudService<T, ID> {
	// T-->Type of object

	// master interface for all interface repository with common methods to reduce
	// the code

	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deletById(ID id);
}
