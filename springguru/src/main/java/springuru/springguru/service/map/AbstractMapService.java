package springuru.springguru.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	// concrete implementation for common methods of interface using Map

	protected Map<ID, T> map = new HashMap<>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(ID id, T object) {
		map.put(id, object);
		return object;
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	public void delete(T object) {
//		Object object2 = map.entrySet();
//		if (object2.equals(object)) {
//			map.remove(object2);
//		}
		// short cut for above methods
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
