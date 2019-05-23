package springuru.springguru.service.sprindatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import springuru.springguru.model.Visit;
import springuru.springguru.repository.VisitRepository;
import springuru.springguru.service.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

	private final VisitRepository visitRepository;

	public VisitSDJpaService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> Visits = new HashSet<>();
		visitRepository.findAll().forEach(Visits::add);
		return Visits;
	}

	@Override
	public Visit findById(Long id) {
//		Optional<Visit> optionalVisit = visitRepository.findById(id);
//		if (optionalVisit.isPresent()) {
//			return optionalVisit.get();
//		}
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
	}

	@Override
	public void deletById(Long id) {
		visitRepository.deleteById(id);
	}

}
