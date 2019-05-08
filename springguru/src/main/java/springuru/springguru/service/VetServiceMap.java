package springuru.springguru.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import springuru.springguru.model.Vet;
import springuru.springguru.service.map.AbstractMapService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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