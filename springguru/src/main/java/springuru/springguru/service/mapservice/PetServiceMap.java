package springuru.springguru.service.mapservice;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import springuru.springguru.model.Pet;
import springuru.springguru.service.PetService;
import springuru.springguru.service.map.AbstractMapService;

@Service
@Profile({ "default", "map" })
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

}
