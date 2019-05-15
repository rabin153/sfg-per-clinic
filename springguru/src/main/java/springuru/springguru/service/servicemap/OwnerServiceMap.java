package springuru.springguru.service.servicemap;

import java.util.Set;

import org.springframework.stereotype.Service;

import springuru.springguru.model.Owner;
import springuru.springguru.model.Pet;
import springuru.springguru.service.OwnerService;
import springuru.springguru.service.PetService;
import springuru.springguru.service.PetTypeService;
import springuru.springguru.service.map.AbstractMapService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		if (object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					} else {
						throw new RuntimeException("Pet Type is required");
					}

					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}

	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
