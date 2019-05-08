package springuru.springguru.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import springuru.springguru.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	// concrete implementation for common methods of interface using Map

	protected Map<Long, T> map = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(T object) {
		// if object is not null go and get the id
		// if object is null grab the id and set via NextId mehtod
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(), object);
		} else {
			// if object is null throw exception
			throw new RuntimeException("Object cannot be null");
		}
		return object;
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	public void delete(T object) {
//		for (Object o : map.entrySet()) {
//			if (o.equals(object)) {
//				map.remove(o);
//			}
//		}
		// short cut for above methods
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	public Long getNextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}

}
