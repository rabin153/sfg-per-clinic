package springuru.springguru.service.servicemap;

import java.util.Set;

import org.springframework.stereotype.Service;

import springuru.springguru.model.Speciality;
import springuru.springguru.model.Vet;
import springuru.springguru.service.SpecialitesService;
import springuru.springguru.service.VetService;
import springuru.springguru.service.map.AbstractMapService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialitesService specilityService;

	public VetServiceMap(SpecialitesService specilityService) {
		this.specilityService = specilityService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {

		if (object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if (speciality.getId() == null) {
					Speciality savedSpeciality = specilityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}

}