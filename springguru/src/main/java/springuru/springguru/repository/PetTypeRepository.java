package springuru.springguru.repository;

import org.springframework.data.repository.CrudRepository;

import springuru.springguru.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
