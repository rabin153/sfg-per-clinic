package springuru.springguru.service.mapservice;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import springuru.springguru.model.Speciality;
import springuru.springguru.service.SpecialitesService;
import springuru.springguru.service.map.AbstractMapService;

@Service
@Profile({ "default", "map" })
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitesService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	@Override
	public void deletById(Long id) {
		super.deleteById(id);
	}
}
