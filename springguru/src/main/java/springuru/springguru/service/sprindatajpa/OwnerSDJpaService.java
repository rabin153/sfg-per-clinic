package springuru.springguru.service.sprindatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import springuru.springguru.model.Owner;
import springuru.springguru.repository.OwnerRepository;
import springuru.springguru.repository.PetRepository;
import springuru.springguru.repository.PetTypeRepository;
import springuru.springguru.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository PetRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository,
			springuru.springguru.repository.PetRepository petRepository, PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		PetRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
//		Optional<Owner> optionalOwner = ownerRepository.findById(id);
//		if (optionalOwner.isPresent()) {
//			return optionalOwner.get();
//		}
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}

	@Override
	public void deletById(Long id) {
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
