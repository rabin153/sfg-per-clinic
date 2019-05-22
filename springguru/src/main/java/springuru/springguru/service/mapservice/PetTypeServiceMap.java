package springuru.springguru.service.mapservice;

import java.util.Set;

import org.springframework.stereotype.Service;

import springuru.springguru.model.PetType;
import springuru.springguru.service.PetTypeService;
import springuru.springguru.service.map.AbstractMapService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

}
